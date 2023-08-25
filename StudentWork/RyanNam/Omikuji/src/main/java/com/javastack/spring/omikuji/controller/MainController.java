package com.javastack.spring.omikuji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class MainController {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping (value="/submit", method=RequestMethod.POST)
	public String login(
			@RequestParam(value="number") Integer number,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="interest") String interest,
			@RequestParam(value= "animal") String animal, 
			@RequestParam(value = "compliment") String compliment,
			HttpSession session 			
			) {
				session.setAttribute("number", number);
				session.setAttribute("city", city);
				session.setAttribute("name", name);
				session.setAttribute("interest", interest);
				session.setAttribute("animal", animal);
				session.setAttribute("compliment", compliment);
					return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/show")
	public String showPage(Model model) {
		return "show.jsp";
	}
}
