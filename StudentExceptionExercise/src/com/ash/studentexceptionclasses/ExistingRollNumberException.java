package com.ash.studentexceptionclasses;

public class ExistingRollNumberException extends Exception {
	
	//extending exception makes this a checked exception
	//extend RunTimeException to create an unchecked exception
	
	//thrown when user tries to input an existing rollNo 

	public ExistingRollNumberException(String message) {
		super(message);
	}
}
