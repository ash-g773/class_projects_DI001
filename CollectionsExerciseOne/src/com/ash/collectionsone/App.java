package com.ash.collectionsone;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		/*
		 * accepts 10 numbers from the user as input and store them in a collection (LinkedHashSet)
		 * numbers should not be duplicated (automatic feature of hashing)
		 * also get the stored index as well as the value
		 */
		
		Scanner scr = new Scanner(System.in);
		
		//creating LinkedHashSet to store values and indices
		Set<LinkedNumbers> numbers = new LinkedHashSet<LinkedNumbers>();
	
		//adds 10 unique inputs to numbers LinkedHashSet
		while (numbers.size() < 10) { //stops when 10 values have been added
			int contains = 0; //counter for whether the number trying to be added exists or not, reset each while loop
			System.out.println("Please enter number " + (numbers.size()+1));
			int value = scr.nextInt(); //gets number input from user
			
			LinkedNumbers numberToAdd = new LinkedNumbers(); //creates new LinkedNumbers object
			numberToAdd.setNumber(value); //sets value
			
			for (int i = 0; i < 10; i++) { //checks for each possible index whether LinkedNumbers object exists
				numberToAdd.setIndex(i);
				if (numbers.contains(numberToAdd)) {
					System.out.println("This number already exists"); //notifies user if the number exists
					contains++; //increments counter - would be better if the for + if loops stopped here so break?
				} 
			}
			
			if (contains == 0) { //checks whether the value of this while loop already exists in LinkedHashSet
				numberToAdd.setIndex(numbers.size() + 1); //corrects index of numberToAdd
				numbers.add(numberToAdd); //adds number to LinkedHashSet
			}
				
		}
		
		for (LinkedNumbers number : numbers) { //iterates through LHS
			System.out.println("Number " + number.getIndex() +", Value " + number.getNumber());
		}
		
	}

}
