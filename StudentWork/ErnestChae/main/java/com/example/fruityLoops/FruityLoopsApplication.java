package com.example.fruityLoops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class FruityLoopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruityLoopsApplication.class, args);
	}  

}
