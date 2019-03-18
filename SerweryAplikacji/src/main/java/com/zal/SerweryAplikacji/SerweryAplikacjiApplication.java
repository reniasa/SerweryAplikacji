package com.zal.SerweryAplikacji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SerweryAplikacjiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerweryAplikacjiApplication.class, args);
	}

}
