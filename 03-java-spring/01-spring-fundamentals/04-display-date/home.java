package com.irina.displayingDate.controller;


//import java.time.LocalDate;
//import java.util.Date();

import java.time.LocalTime;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class home {
	@RequestMapping (value="/", method=RequestMethod.GET)
	public String mainpage() {
		return "index.jsp";
	}
	
	@RequestMapping (value="/time", method=RequestMethod.GET)
	public String timepage(Model model) {
		LocalTime myObj = LocalTime.now();
		model.addAttribute("timenow", myObj);
		return "time.jsp";
	}
	
	@RequestMapping (value="/date", method=RequestMethod.GET)
	public String datepage(Model model) {
		Date mydate = new Date();
		model.addAttribute("today", mydate);
		return "date.jsp";
	}
	
	
	
	

}
