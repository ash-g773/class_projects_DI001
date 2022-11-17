package com.student.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.exceptions.StudentExistsException;
import com.student.presentation.StudentPresentation;

public class StudentClient {
	
	//come here after preparing the config file
	
	public static void main(String[] args) throws StudentExistsException {
				
		//create the spring container with the correct reference file - the java config class in this case
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		//initiate the scanner to take the user input - this is only done in the client section
		Scanner scr = new Scanner(System.in);
		
		//construct a student presentation (and all other layers) using the spring container bean defined		
		StudentPresentation studentPresentation = (StudentPresentation)springContainer.getBean("studentPresentation");
		
		//welcome message :)
		System.out.println("Welcome to the Student Register!");

		 //experimental try catch block for the exceptions
		
			while(true) { //keeps menu running until the user wants to exit the register system
					studentPresentation.showMenu();
					System.out.println("Please enter your choice: ");
					int choice = scr.nextInt();
					try {
					studentPresentation.performMenu(choice);
					} catch (StudentExistsException error)  {
						System.out.println("This student exists already! - from, The Client Layer");
					} catch (Exception error) {
						System.out.println("Unknown error!");
					}
			}				
	}
}
