package com.ash.studentexceptionclasses;

public class InvalidAgeException extends Exception{

	//thrown when user tries to enter negative, less than 4 or greater than 18 ages
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
