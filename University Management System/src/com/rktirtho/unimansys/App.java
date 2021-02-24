package com.rktirtho.unimansys;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Student> students = new ArrayList<Student>();
		
		Student studentOne = new Student("Eaktekar", "Jahan", "Liza", 1, 10538, "Gaibandha");
		Student studentTwo = new Student("Rejaul","Karim", 41, 10538, "Munshigang");
		
		Student studentThree = new Student();
		
		students.add(studentOne);
		students.add(studentTwo);
		students.add(studentThree);
		
		
		for (Student student : students) {
			System.out.println(student);
		}


		
		
		
		

		

	}

}
