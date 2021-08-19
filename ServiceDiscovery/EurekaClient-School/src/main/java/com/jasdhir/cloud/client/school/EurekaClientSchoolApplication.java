package com.jasdhir.cloud.client.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSchoolApplication.class, args);
	}

}
