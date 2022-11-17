package com.ash.exceptionexercise;

public class Employee {

	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	//here we do throws / throw - moves to employee list class
	
	//method to input name - maybe we dont need this now we have employee list class?
//	public void setEmployeeName() {
//		
//		Scanner scr = new Scanner(System.in);
//		
//		System.out.println("Please enter employee name: ");
//		String name = scr.nextLine();
//		
//		addNameToEmployeeList();
//	}
	
	
}
