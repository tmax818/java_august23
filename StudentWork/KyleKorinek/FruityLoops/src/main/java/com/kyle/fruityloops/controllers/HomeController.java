package com.kyle.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

	@RequestMapping("/home")
	public String demo() {
		return "index.jsp";
	}
	
	@GetMapping("/fruits")
	public String getFruits(Model model) {
		String name = "Kyle";
		Integer age = 5;
		Boolean isHungry = true;
		model.addAttribute("name", name);
		model.addAttribute("ageFromController", age);
		model.addAttribute("isHungry", isHungry);
		
		ArrayList<String> users = new ArrayList<String>();
		users.add("Anakin Skywalker");
		users.add("Darth Vader");
		users.add("Darth Sidous");
		users.add("Mace Windu");
		
		model.addAttribute("users", users);
		
		
		return "fruits.jsp";
	}
	
	@RequestMapping("/") 
	public String index(Model model) {
		
		
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Guava", .75));
		
		
		model.addAttribute("fruits", fruits);
		

	
		return "fruits.jsp";
	}

	
	
}




