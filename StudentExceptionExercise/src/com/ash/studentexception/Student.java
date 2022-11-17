package com.ash.studentexception;

import com.ash.studentexceptionclasses.InvalidAgeException;
import com.ash.studentexceptionclasses.InvalidMarksException;

public class Student {

	/*
	 * asks the user to input the rollNo, name, age and marks of a Student - decided to move user interaction to main?
	 * 
	 * raise a custom defined exception when the user enters an existing student rollNo - done
	 * 
	 * raise a custom defined exception when the age is negative, less than 4 or greater than 18 - done
	 * 
	 * raise a custom defined exception when the marks is negative or greater than 100
	 * 
	 * display method, included for easy display purpsoes
	 */
	
	private String rollNo;
	private String name;
	private int age;
	private int marks; //assumes marks are out of 100
	
	//will need for comparison to check it doesnt already exist
	public String getRollNo() {
		return rollNo;
	}
	
	// check to see if it already exists needs to be done before this is called
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	//dont need get name, set name to add students? might not need set either?
	public void setName(String name) {
		this.name = name;
	}
	
	//dont need getAge, need to check valid age before setting
	public void setAge(int age) throws InvalidAgeException {
		if (age < 4 || age > 18) 
			throw new InvalidAgeException("This age is invalid.");
		else
			this.age = age;
	}
	
	//dont need getMarks, need to checked valid marks before setting
	public void setMarks(int marks) throws InvalidMarksException {
		if (marks < 0 || marks > 100)
			throw new InvalidMarksException("This mark is invalid.");
		else
			this.marks = marks;
	}

	//need checks for if a student is created with all fields using the constructor
	public Student(String rollNo, String name, int age, int marks) throws InvalidMarksException, InvalidAgeException {
		this.rollNo = rollNo;
		this.name = name;
		
		if (age < 4 || age > 18) 
			throw new InvalidAgeException("This age is invalid.");
		else
			this.age = age;
		
		if (marks < 0 || marks > 100)
			throw new InvalidMarksException("This mark is invalid.");
		else
			this.marks = marks;
	}
	
	public Student() {
		//empty constructor for use
	}
	
	public void displayStudent() {
		System.out.println("Roll #" + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks + "/100");
	}
		
	
}
