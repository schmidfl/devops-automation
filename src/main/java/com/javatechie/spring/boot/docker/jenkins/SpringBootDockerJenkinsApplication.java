package com.javatechie.spring.boot.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerJenkinsApplication {

	@GetMapping("/jenkins")
	public String message(){
		return "Welcome to CI/CD with Jenkins.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinsApplication.class, args);
	}

}
