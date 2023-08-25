package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
	
	
	@RequestMapping("/search")
	public String searchKeyword(@RequestParam("keyword") String keywordInMethod) {
		return "you are searching for " + keywordInMethod;
	}
	
	
	@RequestMapping("/pet")
	public String getPet(@RequestParam("name") String name, @RequestParam("age") int age) {
		return "Your pet " + name + " is " + age + " years old.";
	}
	
	
	@GetMapping("/optional/pet")
	public String getPetOptional(@RequestParam(value="name", required=false) String petName, @RequestParam(value="age", required=false) Integer petAge) {
		return "Your pet " + petName + " is " + petAge + " years old.";
	}
	
	@RequestMapping("/path/m/{name}/{color}")
	public String petWithColor(@PathVariable("name") String petName, @PathVariable("color") String color) {
		return petName + " is " + color;
	}
}
