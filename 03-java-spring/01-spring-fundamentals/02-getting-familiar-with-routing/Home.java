package com.irina.gettingFamiliarWithRouting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String index() {
//		return "Hello World";
//	}
//	
//	@RequestMapping(value="/hello", method=RequestMethod.GET)
//	public String hello() {
//		return "Hello Sir how are you";
//	}
	
	@RequestMapping(value="/coding", method=RequestMethod.GET)
	public String home() {
		return "index1.jsp";
	}
	
	@RequestMapping(value="/coding/python", method=RequestMethod.GET)
	public String python() {
		return "index2.jsp";
	}
	
	@RequestMapping(value="/coding/java", method=RequestMethod.GET)
	public String javafunction() {
		return "index3.jsp";
	}
	
	
	
	
	

}
