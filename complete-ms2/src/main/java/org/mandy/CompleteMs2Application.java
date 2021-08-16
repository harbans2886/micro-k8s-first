package org.mandy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CompleteMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(CompleteMs2Application.class, args);
	}

}
