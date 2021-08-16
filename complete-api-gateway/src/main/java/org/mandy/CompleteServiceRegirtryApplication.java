package org.mandy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CompleteServiceRegirtryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompleteServiceRegirtryApplication.class, args);
	}
}
