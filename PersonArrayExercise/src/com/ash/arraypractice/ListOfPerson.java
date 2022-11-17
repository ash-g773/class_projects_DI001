package com.ash.arraypractice;

public class ListOfPerson {

	/*
	 * Array of person
	 * methods to manipulate array - input person + display person from array
	 */
	
	private Person[] persons;
	private int totalPersons;
	
	public ListOfPerson(int totalPersons) {
		this.totalPersons = totalPersons;
		persons = new Person[totalPersons];
	}
	
	public void addPerson(Person p, int index) {
		persons[index] = p;
	}
	
	public void displayPersonList() {
		for (int i = 0; i < totalPersons; i++) {
			System.out.println(persons[i].getAge() + " " + persons[i].getPersonId() + " " + persons[i].getPersonName());
		}
	}
}
