package com.benze.securitydemo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecuritydemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringsecuritydemoApplication.class, args);
		SpringApplication app = new SpringApplication(SpringsecuritydemoApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8081"));
        app.run(args);
	}

}
