package com.example.milk_collection_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.milk_collection_service.client")

public class MilkCollectionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilkCollectionServiceApplication.class, args);
	}

}
