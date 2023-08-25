package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@RequestMapping("/option/1")
	public String option1() {
		return "Option 1 request mapping";
	}
	
	@RequestMapping(value="/option/2", method = RequestMethod.GET)
	public String option2() {
		return "option 2 requestMapping";
	}
	
	@GetMapping("option/3")
	public String option3() {
		return "option 3 mapping";
	}

}
