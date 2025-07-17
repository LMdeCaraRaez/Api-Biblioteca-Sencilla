package com.example.biblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableJpaRepositories(basePackages = "com.example.dao")
@EntityScan(basePackages = "com.example.domain")
public class BiblioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioApplication.class, args);
	}
}
