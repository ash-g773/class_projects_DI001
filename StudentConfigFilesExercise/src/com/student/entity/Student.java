package com.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters and setters
@AllArgsConstructor // constructor with all args
@NoArgsConstructor //constructor with no args
@ToString //allows for better printing (?)
public class Student {

	/*
	 *
	 */
	
	private int rollNo;
	private String name;
	private int grade;
	
	
}
