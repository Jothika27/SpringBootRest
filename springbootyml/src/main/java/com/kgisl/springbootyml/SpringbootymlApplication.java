package com.kgisl.springbootyml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SpringbootymlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootymlApplication.class, args);
	}

}
