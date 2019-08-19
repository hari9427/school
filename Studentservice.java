package com.schoolmanagement.service;
import java.util.ArrayList;
import java.util.Scanner;

import com.schoolmanagement.model.Student;

public class Studentservice {
	private static Studentservice instance = null;
	public String q;
	public Studentservice () 
    { 
        q = "school management"; 
    } 
	public static Studentservice getInstance() 
    { 
        if (instance == null) 
            instance = new Studentservice(); 
  
        return instance; 
    } 
	static Scanner getvalue = new Scanner(System.in);
	static ArrayList<String> listOfStudent = new ArrayList<>();
		public static void addstudent()
		{
		Student s=new Student();
		System.out.println("enter the student name");
		s.setName(getvalue.next());
		System.out.println("enter student age:");
		s.setAge(getvalue.nextInt());
		System.out.println("enter the attendance");
		s.setAttendance(getvalue.nextInt());
		System.out.println("details"+s.getName()+"\n"+s.getAge()+"\n"+s.getAttendance());
		}
}	