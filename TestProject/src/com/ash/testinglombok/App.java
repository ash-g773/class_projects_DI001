package com.ash.testinglombok;

public class App {

	public static void main(String[] args) {
		
		LombokTestClass tester = new LombokTestClass("hello", 3, "hello again", 7);
		
		System.out.println(tester);
	}
	
}
