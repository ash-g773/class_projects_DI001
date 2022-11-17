package com.ash.employeetree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Employee implements Comparable<Employee> {
	
	private String id;
	private String name;
	private int exp;
	private String designation;
	private String department;
	private double salary;

	@Override
	public int compareTo(Employee emp2) {
		//adds emp to left of emp2 if exp is more than emp2
		if(exp > emp2.exp)
			return 1;
		//adds to right
		else if (exp < emp2.exp)
			return -1;
		//doesnt add if its a duplicate
		else if (this.equals(emp2))
			return 0;
		//adds to left is its not a duplicate but the exp is the same
		return 1;
	}
	
}

