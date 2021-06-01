package com.irina.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irina.show.models.Book;
import com.irina.show.services.BookService;

@RestController
@RequestMapping("/api")
public class Apihome {
	@Autowired
	private BookService bService;
	
	@GetMapping("")
//	public String frontpage() {
//		return "index.jsp";
//	}
	public List<Book> getBooks(){
		return this.bService.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public Book getSingle(@PathVariable("id") Long id) {
		return this.bService.getSingleBook(id);
	}
	
	@PostMapping("/create")
	public Book createBook(Book a) {
		return this.bService.createBook(a);
	}
	
	@PutMapping("/update/{id}")
	public Book edit(@PathVariable("id") Long id, Book updatedBook) {
		return this.bService.updateBook(updatedBook);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
	}
	
	
}
