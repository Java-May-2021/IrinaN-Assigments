package com.irina.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class home {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mainpage(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		
		Integer currentcount = (Integer) session.getAttribute("count");
		currentcount++;
		session.setAttribute("count", currentcount);
//		System.out.println(session.getAttribute("count"));
		return "main.jsp";
	}
	
	@RequestMapping(value="/counter", method=RequestMethod.GET)
	public String counterpage(Model model, HttpSession session) {
		model.addAttribute("counter", session.getAttribute("count"));
		return "counter.jsp";
	}

}
