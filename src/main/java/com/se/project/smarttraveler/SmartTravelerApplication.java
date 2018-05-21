package com.se.project.smarttraveler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SmartTravelerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartTravelerApplication.class, args);
	}
}
