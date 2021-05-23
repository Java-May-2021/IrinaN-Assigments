package com.irina.helloHuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mainpage() {
		return "index2.jsp";
	}
	
//	@RequestMapping("/")
//	public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
////		System.out.println(searchQuery);
//		model.addAttribute("search", searchQuery);
//		return "index1.jsp";
//	}
	
//	@RequestMapping("/")
//	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name) {
//		model.addAttribute("name", name);
//		return "index.jsp";
//	}
	
	@RequestMapping("/{name}")
	public String showname(@PathVariable("name") String userName, Model model) {
		model.addAttribute("name", userName);
		return "index1.jsp";
	}
	

}
