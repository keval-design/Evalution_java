package Assignment_map;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		StudentRecords sr = new StudentRecords();

		sr.addStudent("1", "keval");
		sr.addStudent("2", "Mohit");
		sr.addStudent("3", "Rahul");
		sr.addStudent("4", "Ramesh");
		
		
		System.out.println("All Students");
		
		sr.printAllStudents();
		
		System.out.println("Student with longest name");
		
	
		System.out.println(Maputils.findStudent(sr.getStudentMap()));


		
		System.out.println("Sorted student by id");
		
		Map<String, String> sorted = Maputils.sortStudent(sr.getStudentMap());
		Maputils.printMap(sorted);


	}

}
