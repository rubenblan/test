package com.microservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesDemoApplication {

	public static void main(String[] args) {
		System.out.println("RUN");
		SpringApplication.run(MicroservicesDemoApplication.class, args);
	}

}
