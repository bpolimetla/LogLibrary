package com.math.calculator;

import java.util.TimeZone;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class WithLibDemoApplication {
	static final private Logger LOGGER = LogManager.getLogger(WithLibDemoApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(WithLibDemoApplication.class, args);
	}

	@PostConstruct
	public void started() {
		LOGGER.info("============= Started with UTC ===============");
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
	
	

}
