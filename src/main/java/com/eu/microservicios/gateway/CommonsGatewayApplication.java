package com.eu.microservicios.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonsGatewayApplication.class, args);
	}
	
}
