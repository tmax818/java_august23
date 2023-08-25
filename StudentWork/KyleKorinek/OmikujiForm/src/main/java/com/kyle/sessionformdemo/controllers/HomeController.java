package com.kyle.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {


	@GetMapping("/form")
	public String form() {
		return "omikujiForm/omikujiForm.jsp";
	}
	
	@PostMapping("/form/submit")
	public String submitForm(HttpSession session, RedirectAttributes redirectattributes, @RequestParam("anyNumber") Integer anyNumber, @RequestParam("city") String city, @RequestParam("realPerson") String realPerson, @RequestParam("hobby") String hobby, @RequestParam("living") String living, @RequestParam("nice") String nice) {
		session.setAttribute("anyNumber", anyNumber);
		session.setAttribute("city", city);
		session.setAttribute("realPerson", realPerson);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("anyNumber", anyNumber);
		session.setAttribute("nice", nice);
		
		return "redirect:/form/display";
	}
	
	@GetMapping("/form/display")
	public String displayForm() {
		return "omikujiForm/omikujiFormDisplay.jsp";
	}

}
