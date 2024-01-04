package com.bookstore.service;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepo;

public class BookServiceImpl implements BookService{
	@Autowired
	BookRepo repo;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return (List<Book>)repo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Optional <Book>find_book=repo.findById(id);
		if(find_book.isPresent()) {
			return repo.findById(id).get();
		}
		else
		{
			throw new BookNotFoundException("Book cannot be found");
			
		}

	}

	@Override
	public Book addBook(Book book) {
	Optional<Book>b1=repo.findById(book.getId());
	Book b=null;
	if(!b1.isPresent()) {
		b=repo.save(book);
	}
	else {
		throw new BookAlreadyExistsException("Book cannot be found");
	}
	return b;
	}

	@Override
	public Book updateBook(Book book) {
		Optional<Book>b1=repo.findById(book.getId());
		Book b=null;
		if(repo.existsById(book.getId())) {
			b=repo.save(book);
			
		}else
		{
			throw new BookNotFoundException("Book cannot be found");
			
		}
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public void deleteBookById(int id) {
		repo.deleteById(id);
