package com.irina.springBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}
@RequestMapping("/")
public String hello() {
	return "Hello client! How are you?";
}

@RequestMapping("/random")
public String welcome() {
	return "Welcome to this page";
}
}
