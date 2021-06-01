package com.irina.show.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.irina.show.models.Book;
import com.irina.show.services.BookService;

@Controller

public class home {
	@Autowired
	private BookService bService;
	
	
	// main page. Shows the list of all books
	@GetMapping("/")
	public String frontpage(Model viewModel) {
		viewModel.addAttribute("allbooks", this.bService.getAllBooks());
		return "index.jsp";
	}
	
	// add page. Takes us to the page that has forms
	@GetMapping("/add")
	public String addbook() {
		return "new.jsp";
	}
	
	// Post path, after user submits forms
	@PostMapping("/new")
	public String newbook(@RequestParam("fname") String name, @RequestParam("desc") String description, @RequestParam("lang") String language, @RequestParam("noPages") int noPages) {
		this.bService.createBook2(name, description, language, noPages);
		return "redirect:/";
	}
	
	// Edit path, after user submits desire to edit
	@RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bService.getSingleBook(id);
        if (book != null){
            model.addAttribute("book", book);
            return "editBook.jsp";
        }else{
            return "redirect:/";
        }
    }
	
	
	

}
