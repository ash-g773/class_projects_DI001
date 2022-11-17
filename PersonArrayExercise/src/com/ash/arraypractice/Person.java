package com.ash.arraypractice;

public class Person {

	private String personId, personName;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String personId, String personName, int age) {
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
}
