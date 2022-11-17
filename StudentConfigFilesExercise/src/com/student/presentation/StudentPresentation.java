package com.student.presentation;

import com.student.exceptions.StudentExistsException;

public interface StudentPresentation {

	//here after implementing the service layer
	
	//this layer does all the user interaction
	
	//showing the menu
	void showMenu();
	
	//carrying out chosen menu options
	void performMenu(int choice) throws StudentExistsException;
	
	
}
