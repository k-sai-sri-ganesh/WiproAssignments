package com.example.gani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.gani.client")
public class LoanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanServiceApplication.class, args);
	}

}
