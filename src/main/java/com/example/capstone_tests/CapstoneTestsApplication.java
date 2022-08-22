package com.example.capstone_tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //@CreatedDate 사용
public class CapstoneTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneTestsApplication.class, args);
	}

}
