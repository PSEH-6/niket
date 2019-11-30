package com.example.SapientTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SapientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapientTestApplication.class, args);
	}

}
