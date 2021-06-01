package com.irina.lock.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.irina.lock.services.songService;

@Controller
public class home {
	@Autowired
	private songService sService;

	@GetMapping("/")
	public String welcomepage() {
		return "welcome.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboardpage(Model model) {
		model.addAttribute("allsongs", this.sService.getAllSongs());
		return "dashboard.jsp";
	}
	
	@GetMapping("/add")
	public String addpage() {
		return "new.jsp";
	}
	
	@PostMapping("/add")
	public String newpage(@RequestParam("title") String title, @RequestParam("artist") String artist, @RequestParam("rating") int rating) {
		 
		// take the form items we entered; create a new song with that
		this.sService.createSong2(title, artist, rating);
		
		return "redirect:/dashboard";
		
	}
	
	@GetMapping("/{id}")
	public String showpage(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thissong", this.sService.getSingleSong(id));
		return "song.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String deletepage(@PathVariable("id") Long id) {
		this.sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/edit/{id}")
	public String editpage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("thissong", this.sService.getSingleSong(id));
		return "editsong.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String editedpage(@PathVariable("id") Long id, @RequestParam("title") String title, @RequestParam("artist") String artist, @RequestParam("rating") int rating) {
		this.sService.updateSong2(id, title, artist, rating);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/topten")
	public String toptenpage(Model model) {
		model.addAttribute("allsongs", this.sService.topTenByRating());
		return "topten.jsp";
	}
	


}
