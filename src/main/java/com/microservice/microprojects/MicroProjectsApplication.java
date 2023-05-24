package com.microservice.microprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer //Enable Eureka server
public class MicroProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroProjectsApplication.class, args);
	}

}
