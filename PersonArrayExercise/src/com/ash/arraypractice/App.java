package com.ash.arraypractice;

import java.util.Scanner;

public class App {

	public static void main (String[] args) {
		//object of listofperson class
		
		Scanner scr = new Scanner(System.in); 
		
		System.out.println("Enter total no. of persons: ");
		int total = scr.nextInt();
		
		ListOfPerson list = new ListOfPerson(total);
		
		for (int i = 0; i < total; i++) {
			Person p = new Person();
			System.out.println("Please enter person name:");
			p.setPersonName(scr.next());
			
			System.out.println("Please enter person id:");
			p.setPersonId(scr.next());
			
			System.out.println("Please enter person age:");
			p.setAge(scr.nextInt());
			
			list.addPerson(p, i);
			
		}
		
		list.displayPersonList();
	}
}
