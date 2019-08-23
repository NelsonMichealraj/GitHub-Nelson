package org.college;

public class Student extends College
{
	public void studname() {
		// TODO Auto-generated method stub
		System.out.println("Student Name: Nelson");
	}
	
	public void studid() {
		// TODO Auto-generated method stub
		System.out.println("Stuent ID: 551");
	}
	
	public void studdept() {
		// TODO Auto-generated method stub
		System.out.println("Student Deptname: EEE");
	}
	
	public static void main(String[] args) 
	{
		Student s =new Student();
		s.clgcode();
		s.clgname();
		s.clgrank();
		s.studdept();
		s.studid();
		s.studname();
		s.Hostelname();
		s.deptname();
	}
}
