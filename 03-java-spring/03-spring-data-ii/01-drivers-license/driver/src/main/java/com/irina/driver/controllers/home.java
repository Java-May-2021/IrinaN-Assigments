package com.irina.driver.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.irina.driver.models.Person;
import com.irina.driver.services.personService;

@Controller

public class home {
	@Autowired
	private personService pService;
	
	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("allpersons", this.pService.getAllPersons());
		return "dashboard.jsp";
	}
	
	
	@GetMapping("/addperson")
	public String addperson() {
		return "newperson.jsp";
		
	}
	
	@PostMapping("/addperson")
	public String addedperson(@RequestParam ("firstName") String firstName, @RequestParam("lastName") String lastName) {
		this.pService.createPerson3(firstName, lastName);
		return "redirect:/";
	}
	
	@GetMapping("/addlicense")
	public String addlicense(Model model) {
		model.addAttribute("allpersons", this.pService.getAllPersons());
		return "/lic.jsp";
	}
	
//	@PostMapping("/addlicense")
//	public String addedlicense(@RequestParam ("number") String number, @RequestParam ("state") String state, @RequestParam ("expiration_date") Date expiration_date, @RequestParam ("person") Person person)  {
//		this.pService.
//		return "redirect:/";
//	}


}
