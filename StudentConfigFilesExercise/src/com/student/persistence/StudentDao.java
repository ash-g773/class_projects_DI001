package com.student.persistence;

import java.util.Collection;

import com.student.entity.Student;

public interface StudentDao {

	//the dao, data access object, accesses the database
	//this is the third step, after setting up the database file
	
	//getting the whole database
	Collection<Student> getAllStudents();
	
	//searching the database for a student
	Student searchStudent(int id);
	
	//adding to database
	Student addStudent(Student student);
	
	//removing from database
	Student removeStudent(Student student);
	
	//after creating this interface, we move onto the implementation class
}
