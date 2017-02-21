package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoprojectApplication {

	@RequestMapping("/")
	public String helloworld() {
		return "Hello Docker world!";

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoprojectApplication.class, args);
	}
}
