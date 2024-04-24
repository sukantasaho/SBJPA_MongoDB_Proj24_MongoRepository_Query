package com.main.service;

import java.util.List;

import com.main.document.Doctor;
 

public interface IDoctorMngtService 
{
    public String saveDoctor(Doctor doctor);
    public String saveAllDoctors(List<Doctor> dList);
    public List<Doctor> getAllDoctorsBasedOnSalaryRange(Float start, Float end);
    public List<Doctor> fetchSingleDoctorByName(String name);
    public List<Object[]> getDataByName(String name);
    public List<Doctor> getDoctorBasedOnNameAndAddress(String name, String address);
    public List<Doctor> getDoctorsBasedOnSalaryRange(Float range1, Float range2);
    public  List<Doctor> getDoctorBasedOnName(String name1, String name2);
    public List<Doctor> getDoctorsBasedOnChars(String chars);
	 
    
}
