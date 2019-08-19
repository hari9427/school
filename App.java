package com.schoolmanagement.main;

import java.util.*;

import com.schoolmanagement.dao.StudentDAO;
import com.schoolmanagement.dao.TeacherDAO;
import com.schoolmanagement.model.Student;
import com.schoolmanagement.model.Teacher;
import com.schoolmanagement.service.Studentservice;
public class App
{
	
	public static void main(String args[]){
		
		Scanner getvalue=new Scanner(System.in);
		System.out.println("1.student,2.teacher");
		int val = getvalue.nextInt();
		Teacher tcr=new Teacher();
		Student stu=new Student();
		stu.getName();
		Studentservice st =new Studentservice();
		st.addstudent();
		TeacherDAO td= new TeacherDAO();
		td.addteacher();
		StudentDAO fs=new StudentDAO();
		fs.addstudent();
		}
	}




	
