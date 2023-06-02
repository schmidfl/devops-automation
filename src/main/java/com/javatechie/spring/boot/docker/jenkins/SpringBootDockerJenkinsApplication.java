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
		return "Welcome to CI/CD with Azure DevOps pipeline: maven build, docker image build, push image to azure container registry.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinsApplication.class, args);
	}

}
