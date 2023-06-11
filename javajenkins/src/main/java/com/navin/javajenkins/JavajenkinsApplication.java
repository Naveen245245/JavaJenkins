package com.navin.javajenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavajenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavajenkinsApplication.class, args);
	}
	
	@GetMapping("/jen/{name}")
	public String greet(@PathVariable String name){
		return "Hello "+name;
	}

}
