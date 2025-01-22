package com.example.ServiceGatewayAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceGatewayApiApplication.class, args);
	}

}
