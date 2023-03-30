package com.jilani.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(JavaJenkinsApplicationTests.class);
	
	
	@Test
	void contextLoads() {
		logger.info("testing is executing.....");
		assertEquals(true, true);
	}

}
