package com.book.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.book.presentation.BookPresentation;

public class BookClient {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(BookConfiguration.class);
		
		BookPresentation bookPresentation = (BookPresentation)springContainer.getBean("bookPresentation");
		
		while(true) {
			bookPresentation.showMenu();
			System.out.println("Enter choice:");
			int choice = scr.nextInt();
			bookPresentation.performMenu(choice);
		}
		
		//the order of construction is DAO (Persistence) >> Service >> Presentation
		
	}
}
