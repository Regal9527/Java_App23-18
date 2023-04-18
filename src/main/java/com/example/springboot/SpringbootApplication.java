package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootApplication {


	@GetMapping
	public String message(){
		return "welcome to regal";

	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

	}

}
