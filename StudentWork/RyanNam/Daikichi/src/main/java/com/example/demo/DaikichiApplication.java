package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

public class DaikichiApplication {
	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}
}
