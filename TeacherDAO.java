package com.schoolmanagement.dao;

import java.util.Scanner;

import com.schoolmanagement.model.Teacher;

public class TeacherDAO {
	private static TeacherDAO instance = null;
	public String q;
	public TeacherDAO () 
    { 
        q = "school management"; 
    } 
	public static TeacherDAO getInstance() 
    { 
        if (instance == null) 
            instance = new TeacherDAO(); 
        return instance; 
    } 
	public void addteacher() {
		Scanner getvalue =new Scanner(System.in);
		Teacher s= new Teacher();	
		System.out.println("enter the Teacher name");
		s.setName(getvalue.next());
		System.out.println("enter Teacher age:");
		s.setAge(getvalue.nextInt());
		System.out.println("enter the attendance");
		s.setAttendance(getvalue.nextInt());
		System.out.println("details:::"+s.getName()+"\t"+s.getAge()+"\t"+s.getAttendance());
		
		}
}



