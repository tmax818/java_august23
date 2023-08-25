package com.javaspring.omikujiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {
	
	@GetMapping("/omikuji")
	public String formPage() {
		return "form.jsp";
	}
	
	@PostMapping("/omikuji/process")
	public String sendForm
	(
			@RequestParam("number") Integer number,
			@RequestParam("city") String city, @RequestParam("person") String person,
			@RequestParam("hobby") String hobby, @RequestParam("livingThing") String livingThing,
			@RequestParam("somethingNice") String somethingNice, HttpSession session
	) 
	{
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String showForm() {
		return "showForm.jsp";
	}
}
