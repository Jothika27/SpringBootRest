package com.kgisl.springmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SpringmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmdbApplication.class, args);
	}

}
