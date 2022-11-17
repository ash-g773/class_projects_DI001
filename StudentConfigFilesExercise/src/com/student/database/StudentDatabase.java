package com.student.database;

import java.util.LinkedHashMap;
import java.util.Map;

import com.student.entity.Student;

public class StudentDatabase {

	//filling this in is the second step, after filling in student entity
	
	//set the database holding object to static private so that only one of it can exist at a time
	static private Map<Integer, Student> studentList = new LinkedHashMap<Integer, Student>();
	
	//we put the following lines in a static block so that when the first constructor / call to the database is made these records are added to our database holding object
	static {
		studentList.put(101, new Student(101, "student one", 1));
		studentList.put(102, new Student(102, "student two", 2));
		studentList.put(103, new Student(103, "student three", 2));
		studentList.put(104, new Student(104, "student four", 3));
		studentList.put(105, new Student(105, "student five", 6));
	}
	
	public static Map<Integer, Student> getStudentList() { //why is this one static?
		return studentList;
	}
	
	//from the database file we move on to the persistence file DAO
}
