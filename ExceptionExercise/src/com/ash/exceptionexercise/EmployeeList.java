package com.ash.exceptionexercise;

public class EmployeeList {

	private String nameList[];
	private Employee employeeList[];
	
	public void setListLength(int length) { //store this length variable as part of the employeelist object
		nameList = new String[length];
		employeeList = new Employee[length];
	}
		
	//here we do throw/s
	
	//adding employee to list - checks name and age, should it be separate? no ? maybe - if u wanted to add an employee with only one field maybe?
	
	//checking values intended to be added
//	public void checkEmployeeValues(String name, int age) throws NameCheckedException, AgeCheckedException {
//		for (String nameExisting : nameList) {
//			if (nameExisting.equalsIgnoreCase(name))
//					throw new NameCheckedException("The employee " + name + " already exists");
//		}
//		
//		if (age < 18 || age > 60)
//			throw new AgeCheckedException("This employee is not eligible to work.");
//		
//	}
	
	//numArray contains 
	//doing the checks while setting the values for employee
	
	public void checkEmployeeName(String name) throws NameCheckedException {
		for (int i = 0; i < nameList.length(); i++) {
			if (nameList[i].equalsIgnoreCase(name))
					throw new NameCheckedException("The employee " + name + " already exists");
		} else {
			nameList[i] = name;
		}
	}
	
	public void checkEmployeeAge(int age) throws AgeCheckedException {
		if (age < 18 || age > 60)
			throw new AgeCheckedException("This employee is not eligible to work.");
	}
	
	//adding values when checks are passed
	public void addCheckedEmployeeValue(Employee employee, int index) {
		employeeList[index] = employee;
	}
}
 