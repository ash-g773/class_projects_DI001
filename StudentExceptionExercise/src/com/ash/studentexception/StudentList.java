package com.ash.studentexception;

import com.ash.studentexceptionclasses.ExistingRollNumberException;

public class StudentList {

	private Student[] register;
	private int registerLength;
	//private String[] existingRollNos; dont need?
	
//	public void setRegisterLength(int regLength) {
//		this.registerLength = regLength;
//	} dont need this either as the constructor sets this already
	
	public StudentList(int registerLength) {
		this.registerLength = registerLength;
		register = new Student[registerLength];
	}
	
	//index variable passed in represents total students added so far
	public void inputStudent(Student student, int index) throws ExistingRollNumberException {
		
		for (int i = 0; i < index; i++) {
			if (register[i].getRollNo().equals(student.getRollNo()))
				throw new ExistingRollNumberException("This roll number exists!");
		}
		
		register[index] = student; //adding if the exception isnt thrown ie if the roll no doesnt exist yet
	}
	
	public void displayRegister() {
		for (Student student : register) {
			student.displayStudent();;
		}
	}
}
