package com.irina.show.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irina.show.models.Book;
import com.irina.show.repositories.BookRepository;

@Service

public class BookService {
	private final BookRepository bookRepo;
	
	public BookService (BookRepository a) {
		this.bookRepo = a;
	}
	
	// Display All Books
	public List<Book> getAllBooks(){
		return this.bookRepo.findAll();
	}
	
	// Display One Book
	public Book getSingleBook(Long id) {
		return this.bookRepo.findById(id).orElse(null);
	}
	
	// Create Book
	public Book createBook(Book a) {
		return this.bookRepo.save(a);
	}
	
	// Create Book from constructor 
	public Book createBook2(String name, String description, String language, int noPages) {
		Book newBook = new Book(name, description, language, noPages);
		return this.bookRepo.save(newBook);
	}
	
	// Delete Book
	public void deleteBook(Long id) {
		this.bookRepo.deleteById(id);
	}
	
	// Update Book
	public Book updateBook(Book a) {
		return this.bookRepo.save(a);
	}
	
	// update two books
	
	
	
}
