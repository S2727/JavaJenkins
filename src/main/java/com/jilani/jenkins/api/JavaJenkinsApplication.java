package com.jilani.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JavaJenkinsApplication {

	public static Logger logger=LoggerFactory.getLogger(JavaJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		
		logger.info("Application is started...");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JavaJenkinsApplication.class, args);
	}

}
