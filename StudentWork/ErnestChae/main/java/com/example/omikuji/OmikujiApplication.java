package com.example.omikuji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class OmikujiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiApplication.class, args);
	}
	
	 @RequestMapping("/omikuji")
	    public String index() {
	        return "index.jsp";
	    }
	 
	 @RequestMapping(value="/post",method=RequestMethod.POST)
	 public String post(
		@RequestParam(value="picker") String picker,
	 	@RequestParam(value="city") String city,
	    @RequestParam(value="person") String person,
	    @RequestParam(value="hobby") String hobby,
	    @RequestParam(value="animal") String animal,
	    @RequestParam(value="nice") String nice,
	    HttpSession session
	    ) {
		    session.setAttribute("picker", picker);
		    session.setAttribute("city", city);
		    session.setAttribute("person", person);
		    session.setAttribute("hobby", hobby);
		    session.setAttribute("animal", animal);
		    session.setAttribute("nice", nice);
		    return "redirect:/omikuji/show"; 
		    }
	 
	 @RequestMapping("/omikuji/show")
	 public String result() {
 	
	    return "results.jsp"; 
	 }
	 
}
