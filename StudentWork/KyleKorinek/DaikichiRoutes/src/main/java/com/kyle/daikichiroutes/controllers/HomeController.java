package com.kyle.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@RequestMapping("/daikichi")
	public String daikichi() {
		return "welcome";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endevors!";
	}

	@GetMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opprotunity willarise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/daikichi/travel/m/{destination}")
	public String destination(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination + "!";
	}
	
	@RequestMapping("/daikichi/lotto/m/{num}")
	public String lotto(@PathVariable("num") Integer num) {
		if(num %2 == 0) {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		} else {
		return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
	}
	
	
}
