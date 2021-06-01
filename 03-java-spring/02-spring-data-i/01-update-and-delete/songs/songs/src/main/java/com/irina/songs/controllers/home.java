package com.irina.songs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.irina.songs.services.songService;

@Controller
public class home {
	@Autowired
	private songService sService;
	
	// main page. Shows the list of all songs
	@GetMapping("/")
	public String frontpage(Model viewModel) {
		viewModel.addAttribute("allsongs", this.sService.getAllSongs());
		return "index.jsp";
	}

	// add page. Takes us to the page that has forms
	@GetMapping("/add")
	public String addbook() {
		return "new.jsp";
	}
	
	// Post path, after user submits forms
	@PostMapping("/new")
	public String newSong(@RequestParam("name") String name, @RequestParam("singer") String singer, @RequestParam("duration") int duration) {
		this.sService.createSong2(name, singer, duration);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String songPage(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("thissong", this.sService.getSingleSong(id));
		return "songPage.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("thissong", this.sService.getSingleSong(id));
		return "editSong.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String editSong(@RequestParam("name") String name, @RequestParam("singer") String singer, @RequestParam("duration") int duration, @PathVariable("id") Long id) {
		this.sService.updateSong2(id, name, singer, duration);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
		return "redirect:/";
	}

//	
//	// Edit path, after user submits desire to edit
//	@RequestMapping("/edit/{id}")
//    public String editBook(@PathVariable("id") Long id, Model model) {
//        Book book = bService.getSingleBook(id);
//        if (book != null){
//            model.addAttribute("book", book);
//            return "editBook.jsp";
//        }else{
//            return "redirect:/";
//        }
//    }

}
