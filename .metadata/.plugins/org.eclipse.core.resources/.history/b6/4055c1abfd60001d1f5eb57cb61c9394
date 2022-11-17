package com.book.persistence;

import java.util.Collection;

import com.book.database.BookDatabase;
import com.book.entity.Book;

public class BookDaoImpl implements BookDao{
	
	//no constructor?

	@Override
	public Collection<Book> getAllBooks() {
		return BookDatabase.getBookList().values();
	}

	@Override
	public Book searchBook(int id) {
		return BookDatabase.getBookList().get(id);
	}

	@Override
	public Book insertBook(Book book) {
		return BookDatabase.getBookList().put(book.getBookId(), book);
	}

}
