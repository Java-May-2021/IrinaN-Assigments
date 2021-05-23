package com.irina.ninjaGold.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class home {
//	@RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping("/")
	public String mainpage(HttpSession session, Model viewModel) {
		ArrayList<String> activity = new ArrayList<String>();
		
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 50);
		}
		
		if (session.getAttribute("activity") == null) {
			session.setAttribute("activity", activity);
		}
		
		viewModel.addAttribute("totalgold", session.getAttribute("gold"));
		viewModel.addAttribute("activity", session.getAttribute("activity"));
		return "index.jsp";
	}
	
//	@RequestMapping(value="/addgold", method=RequestMethod.POST)
	@PostMapping("/addGold")
	private String earnGold(HttpSession session, @RequestParam("building") String building) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		Random r = new Random();
		int gold = (int) session.getAttribute("gold");
		int goldnumber;
		if(building.equals("farm")){
			// it's coming from farm
			goldnumber = r.nextInt((20-10)+1) + 10;
			activity.add(String.format("You entered a %s and earned %s at %s \n", building, goldnumber, now));
		}
		else if (building.equals("cave")) {
			// it's coming from cave
			goldnumber = r.nextInt((10-5)+1) + 5;
			activity.add(String.format("You entered a %s and earned %s at %s \n", building, goldnumber, now));
			
		} else if (building.equals("house")) {
			// it's coming from house
			goldnumber = r.nextInt((5-2)+1) + 2;
			activity.add(String.format("You entered a %s and earned %s at %s \n", building, goldnumber, now));
			
		} else {
			// it's coming from casino
			goldnumber = r.nextInt((50+50)+1) - 50;
			if(goldnumber > 0) {
				activity.add(String.format("You entered a %s and earned %s gold %s \n", building, goldnumber, now));
			} else {
				activity.add(String.format("You entered a %s and lost %s gold, OhOh %s \n", building, goldnumber, now));
			}
		}
		
		int totalgold = gold += goldnumber;
		session.setAttribute("gold", totalgold);
		session.setAttribute("activity", activity);
		
		return "redirect:/";
	}
	
	
	

}
