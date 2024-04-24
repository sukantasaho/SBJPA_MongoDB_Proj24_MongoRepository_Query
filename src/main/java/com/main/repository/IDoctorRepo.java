package com.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.main.document.Doctor;
 

public interface IDoctorRepo  extends MongoRepository<Doctor, Integer>, CrudRepository<Doctor, Integer>
{
      public  List<Doctor> findBySalaryBetween(Float start, Float end);
      public  List<Doctor> findByName(String name);
      @Query(value = "{name:?0}", fields = "{name:1,salary:1}")
      public List<Object[]> getData(String name);
      
      @Query(value = "{name:?0,addr:?1}")
      public List<Doctor> getDataBasedOnNameAndAddress(String name, String address);
      
      @Query(value = "{salary:{$gte:?0},salary:{$lte:?1}}")
      public List<Doctor> getDataBasedSalaryRange(Float range1, Float range2);
      
      @Query(value = "{$or:[{name:?0},{name:?1}]}")
      public List<Doctor> getDataBasedOnName(String name1, String name2);
      
      //@Query(value = "{name:{'$regex':?0}}") //case sensitive
      @Query(value = "{name:{'$regex':?0, $options:'i'}}")//case insensitive
      public List<Doctor> getDataBasedOnNameCharacter(String chars);
}
