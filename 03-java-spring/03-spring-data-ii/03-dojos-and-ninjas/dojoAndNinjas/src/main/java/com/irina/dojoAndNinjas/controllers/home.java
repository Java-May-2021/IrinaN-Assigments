package com.irina.dojoAndNinjas.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.irina.dojoAndNinjas.models.Dojo;
import com.irina.dojoAndNinjas.models.Ninja;
import com.irina.dojoAndNinjas.services.dojoService;
import com.irina.dojoAndNinjas.services.ninjaService;

@Controller
public class home {
	@Autowired
	private dojoService dservice;
	
	@Autowired
	private ninjaService nservice;
	
	@GetMapping("/")
	public String addpage(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/add")
	public String addedpage(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		}
		this.dservice.createDojo(dojo);
		return "redirect:/newNinja";
	}
	
	@GetMapping("/newNinja")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", this.dservice.getAllDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/newNinja")
	public String addedNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/newNinja";
		}
		this.nservice.createNinja(ninja);
		Long thisDojoId = ninja.getDojo().getId();
		return "redirect:/dojo/" + thisDojoId;
	}
	
	@GetMapping("/dojo/{id}")
	public String dojopage(@PathVariable("id") Long id, Model model) {
		model.addAttribute("thisdojo", this.dservice.getSingleDojo(id));
		return "index.jsp";
	}
	
}
