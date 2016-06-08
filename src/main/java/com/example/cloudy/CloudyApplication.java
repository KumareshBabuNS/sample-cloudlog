package com.example.cloudy;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudyApplication {

	private static Logger log = LoggerFactory.getLogger(CloudyApplication.class);

	@PostConstruct
	private void logSomething() {
		log.debug("This is a debug message");
		log.info("This is an info message");
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudyApplication.class, args);
	}

}
