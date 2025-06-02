package com.masai;

public class Student {

	private String name;
	private int rollno;
	private double marks;
	
	public  void student(String name ,int rollno,double marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		
	}
	
	public void printDetails(String name,int rollno,double marks) {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(marks);
	}
	
	
	public static void main(String[] args) {
		

	}

}