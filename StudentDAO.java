package com.schoolmanagement.dao;

import java.util.Scanner;

import com.schoolmanagement.model.Student;
import com.schoolmanagement.model.Teacher;
import com.schoolmanagement.service.Studentservice;

	public class StudentDAO {
		private static StudentDAO instance = null;
		public String q;
		public StudentDAO () 
	    { 
	        q = "school management"; 
	    } 
		public static StudentDAO getInstance() 
	    { 
	        if (instance == null) 
	            instance= new StudentDAO(); 
	  
	        return instance;
	    } 
		public void addstudent() {
			Scanner getvalue =new Scanner(System.in);
			Student s= Student.getInstance();	
			System.out.println("enter the Teacher name");
			s.setName(getvalue.next());
			System.out.println("enter Teacher age:");
			s.setAge(getvalue.nextInt());
			System.out.println("enter the attendance");
			s.setAttendance(getvalue.nextInt());
			System.out.println("details::"+s.getName()+"\t"+s.getAge()+"\t"+s.getAttendance());
			
			}

	}



	

