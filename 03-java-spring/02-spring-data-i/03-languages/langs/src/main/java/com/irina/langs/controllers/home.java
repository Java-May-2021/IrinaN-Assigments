package com.irina.langs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.irina.langs.services.langService;

@Controller
public class home {
	@Autowired
	private langService lService;
	
	@GetMapping("/add")
	public String newpage() {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String addnewlang(@RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("version") int version) {
		this.lService.createlang2(name, creator, version);
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String mainpage(Model model) {
		model.addAttribute("allangs", this.lService.getAllLangs());
		return "index.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable ("id") Long id, Model model) {
		model.addAttribute("thislang", this.lService.getSingleLang(id));
		return "editPage.jsp";
		
	}
	
	@PostMapping("/edit/{id}")
	public String editedpage(@PathVariable ("id") Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("version") int version) {
		this.lService.updateLang2(id, name, creator, version);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deletepage(@PathVariable("id") Long id) {
		this.lService.deleteLang(id);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String languagepage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("thislang", this.lService.getSingleLang(id));
		return "language.jsp";
	}


}
