package com.example.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoprojectApplication.class, args);
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "Test1 is working from container";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "Test2 is working from container";
	}
	
	@PostMapping("/post")
	public String getPost(@RequestBody String name) {
		return "Hello, "+name+" Welcome";
	}


}
