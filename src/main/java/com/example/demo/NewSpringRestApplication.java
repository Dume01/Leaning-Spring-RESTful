package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewSpringRestApplication.class, args);
		System.out.println("The server is running on port 8080.");
	}

}
