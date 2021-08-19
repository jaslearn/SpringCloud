package com.jasdhir.cloud.client.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientStudentApplication.class, args);
	}

}
