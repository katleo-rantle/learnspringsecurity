package com.katleo.learnspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.katleo.learnspringsecurity.ch05_h2InMemoryDB")
public class LearnspringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnspringsecurityApplication.class, args);
	}

}
