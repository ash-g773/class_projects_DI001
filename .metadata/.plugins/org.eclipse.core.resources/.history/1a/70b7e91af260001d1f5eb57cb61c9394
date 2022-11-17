package com.book.presentation;

import java.util.Scanner;

import com.book.service.BookService;

public class BookPresentationImpl implements BookPresentation {
	
	private BookService bookService;
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public void showMenu() {
		System.out.println("===========================");
		System.out.println("Book Management System");
		System.out.println("1. List All Books");
		System.out.println("2. Search Book By ID");
		System.out.println("3. Add New Book");
		System.out.println("4. Exit");
		System.out.println("============================");

	}
	
	@Override
	public void performMenu(int choice) {
		Scanner scr = new Scanner(System.in);
		
		switch(choice) {
			case 1:
				System.out.println("List all books - tbi");
				break;
			case 2:
				System.out.println("search book by id - tbi");
				break;
			case 3:
				System.out.println("add new book - tbi");
				break;
			case 4:
				System.out.println("Thanks for using the book system!");
				break;
			default:
				System.out.println("unknown input");			
				
	}
	}
	

}
