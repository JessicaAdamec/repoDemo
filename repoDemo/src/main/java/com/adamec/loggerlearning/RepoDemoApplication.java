package com.adamec.loggerlearning;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepoDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	public static void main(String[] args) {
		SpringApplication.run(RepoDemoApplication.class, args);
	
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);

        logger.debug("Hello from Logback {}", data);
        logger.info("HELLO FROM INFO");
	}

}
