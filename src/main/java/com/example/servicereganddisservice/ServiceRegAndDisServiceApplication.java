package com.example.servicereganddisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegAndDisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegAndDisServiceApplication.class, args);
	}

}
