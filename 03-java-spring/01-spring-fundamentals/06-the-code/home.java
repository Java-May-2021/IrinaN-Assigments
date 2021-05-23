package com.irina.theCode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class home {
	@RequestMapping("/")
	public String mainpage(@ModelAttribute("mistakes") String mistakes, Model model) {
		model.addAttribute("mistakes", mistakes);
		return "index.jsp";
	}
	
	@PostMapping("/test")	
	public String testpage(@RequestParam(value="code", required=false) String code, RedirectAttributes redirectAttributes) {
		if (code.equals("bushido")) {
			return "secret.jsp"; 
		} else {
			redirectAttributes.addFlashAttribute("mistakes", "You must train much harder");
			return "redirect:/"; }
	}
	
}
