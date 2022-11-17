package com.student.presentation;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.entity.Student;
import com.student.exceptions.StudentExistsException;
import com.student.service.StudentService;

@Component("studentPresentation")
public class StudentPresentationImpl implements StudentPresentation {
	
	private StudentService service;
	
	@Autowired
	public StudentPresentationImpl(StudentService service) {
		this.service = service;
	}

	@Override
	public void showMenu() {
			
		System.out.println("--------------------------------");
		System.out.println("1. List all Students");
		System.out.println("2. Search by Student ID");
		System.out.println("3. Add a Student");
		System.out.println("4. Remove a Student");
		System.out.println("5. Exit the Register");
		System.out.println("--------------------------------");
		
	}

	@Override
	public void performMenu(int choice) throws StudentExistsException {
		Scanner scr2 =new Scanner(System.in);
			switch(choice) {
			case 1:
				System.out.println("All students registered: ");
				Collection<Student> register = service.getAllStudents();
				for(Student student : register) {
					System.out.println(student); //where lombok tostring comes in
				}
				break; //leaves the switch statement
			case 2:
				System.out.println("Search for a Student by Student ID");
				System.out.println("Please enter the Student ID to search for: ");
				int idChoice = scr2.nextInt();
				Student studentFound = service.searchStudentById(idChoice);
				System.out.println("Student found: ");
				if (studentFound!=null) {
					System.out.println(studentFound);
				} else {
					System.out.println("Student does not exist in the register...");
				}
				break;
			case 3:
				System.out.println("Adding a new Student to the Register");
				Student studentAdded = new Student();
				System.out.println("Please enter roll number: ");
				studentAdded.setRollNo(scr2.nextInt());
				System.out.println("Please enter name: ");
				studentAdded.setName(scr2.next());
				System.out.println("Please enter grade: ");
				studentAdded.setGrade(scr2.nextInt()); //input mismatch exception?? before i even type anything :O
				
				System.out.println("Checking if student exists...");
				if (service.addNewStudent(studentAdded)) {
					System.out.println("Student Successfully Added!");
				} 			
				break;
			case 4: 
				System.out.println("Removing an existing Student from the Register");
				System.out.println("Please enter the student's roll number: ");
				int studentRemovedRollNum = scr2.nextInt();
				
				Student student = service.searchStudentById(studentRemovedRollNum);
				if (service.removeExistingStudent(student)) {
					System.out.println("Student Successfully Removed!");
				}
				break;
			case 5:
				System.out.println("Thank you for using the Student Register system!");
				System.exit(0);
			default:
				System.out.println("Unrecognized Input");
				break;
			}
		
	}
	
	//get some basic to be implemented messages in each of the menu options and then move onto the config and client files to test run the program

}
