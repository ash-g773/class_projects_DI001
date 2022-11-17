package com.ash.studentexceptionclasses;

public class InvalidMarksException extends Exception {

	//thrown when a user tries to input negative or greater than 100 marks
	
	public InvalidMarksException(String message) {
		super(message);
	}
}
