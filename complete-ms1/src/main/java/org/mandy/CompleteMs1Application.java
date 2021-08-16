package org.mandy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CompleteMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(CompleteMs1Application.class, args);
	}

}
