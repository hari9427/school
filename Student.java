package com.schoolmanagement.model;
public class Student {
	private static Student instance = null;
	public String q;
	public Student() 
    { 
        q = "school management"; 
    } 
	public static Student getInstance() 
    { 
        if (instance == null) 
            instance = new Student(); 
  
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
}
