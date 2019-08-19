package com.schoolmanagement.service;

import java.util.Scanner;

import com.schoolmanagement.model.Teacher;

public class Teacherservice {
	private static Teacherservice single_instance = null;
	public String q;
	private Teacherservice () 
    { 
        q = "school management"; 
    } 
	public static Teacherservice getInstance() 
    { 
	if (single_instance == null) 
            
           single_instance = new Teacherservice(); 
  
        return single_instance;
    } 	
		public void addteacher() {
			Scanner getvalue =new Scanner(System.in);
			Teacher s= new Teacher();	
			System.out.println("enter the Teacher name");
			s.setName(getvalue.next());
			System.out.println("enter the Teacher age:");
			s.setAge(getvalue.nextInt());
			System.out.println("enter the attendance");
			s.setAttendance(getvalue.nextInt());
			System.out.println("details:::"+s.getName()+"\t"+s.getAge()+"\t"+s.getAttendance());
			}
}













