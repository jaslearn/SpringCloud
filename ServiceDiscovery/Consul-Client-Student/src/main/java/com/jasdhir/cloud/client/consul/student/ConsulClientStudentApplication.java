package com.jasdhir.cloud.client.consul.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulClientStudentApplication.class, args);
	}

}
