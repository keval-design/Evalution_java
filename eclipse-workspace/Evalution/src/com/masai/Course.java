package com.masai;

public class Course {
     private String course_name;
     private String instructor_name;
     int instructor_id;
     
     
     public void course(String course_name,String instructor_name,int instructor_id) {
    	 this.course_name = course_name;
    	 this.instructor_name = instructor_name;
    	 this.instructor_id = instructor_id;
     }
     public void printdetalis(String course_name,String instructor_name,int instructor_id) {
    	System.out.println(course name);
    	System.out.println(instructor_name);
    	System.out.println(instructor_id);
     }
     
}
