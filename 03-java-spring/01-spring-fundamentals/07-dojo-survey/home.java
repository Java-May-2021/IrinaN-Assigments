package com.irina.dojoSurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class home {
	@GetMapping("/")
	public String mainpage() {
		return "index.jsp";
	}
	
	@PostMapping("/share")
	public String mainpage2(@RequestParam(value="fname", required=false) String fname, @RequestParam(value="loc", required=false) String loc, @RequestParam(value="lang", required=false) String lang, @RequestParam(value="comment", required=false) String comment, Model model) {
		model.addAttribute("fname", "Dear " + fname);
		model.addAttribute("loc", loc);
		model.addAttribute("lang", lang);
		model.addAttribute("comment", comment);
		return "index2.jsp";
	}

}
