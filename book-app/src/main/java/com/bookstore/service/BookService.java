package com.bookstore.service;

import java.util.List;

import com.bookstore.model.Book;

public interface BookService {
	List<Book> getAllBooks();
	Book getBookById(int id);
	Book addBook(Book book);
	Book updateBook(Book book);
	void deleteBookById(int id);

}
