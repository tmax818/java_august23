package com.andrew.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
	@RequestMapping("/daikichi/travel/{city}")
	public String searchWord(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city + " !!!";
	}

	@RequestMapping(value = "/daikichi/lotto/{num}")
	public String lotto(@PathVariable("num") Integer num) {
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";

		}

	}
}