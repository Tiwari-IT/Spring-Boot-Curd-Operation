package com.vip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees Basic API", version = "0.0.1-SNAPSHOT", 
description = "Employees Information"))
public class SpringBootCurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdOperationApplication.class, args);
	}

}
