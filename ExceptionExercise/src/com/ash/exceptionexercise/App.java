package com.ash.exceptionexercise;

import java.util.Scanner;

public class App {

	//here we do try catch blocks
	
	//for loop for # employees
	// pls input details for employee # i
	// check name + catch NameCheckedException + generic?
	// check age + catch AgeChecedException + generic?
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		EmployeeList empList = new EmployeeList();
		
		System.out.println("Please input the number of employees to be stored: ");
		int inputLength = scr.nextInt();
		empList.setListLength(inputLength);
		
		for (int i = 0; i < inputLength; i++) {
			Employee employee;
			System.out.println("Please enter the name of employee #" + (i+1));
			String empName = scr.next();
			
			System.out.println("Please enter the age of employee #" + (i+1));
			int empAge = scr.nextInt();
			
			try {
//				empList.checkEmployeeValues(empName, empAge);
				empList.checkEmployeeAge(empAge);
				empList.checkEmployeeName(empName);
				
			} catch(AgeCheckedException exception) {
				System.out.println("Employee is not eligible to work!");				
			} catch(NameCheckedException exception) {
				System.out.println("Employee name " + empName + " already exists!");
			}
//			} catch(Exception exception) {
//				System.out.println("Unknown Error");
//			}
			
			employee = new Employee(empName, empAge);			
		}
		
	}
}
