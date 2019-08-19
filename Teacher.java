package com.schoolmanagement.model;

import java.util.Scanner;

import com.schoolmanagement.dao.TeacherDAO;

public class Teacher {
	private static Teacher instance = null;
	public String q;
	public Teacher() 
    { 
        q= "school management"; 
    } 
	public static Teacher getInstance() 
    { 
        if (instance == null) 
            instance = new Teacher(); 
  
        return instance; 
    } 
	private String name;
	private int age;
	private int attendance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance= attendance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		

}
