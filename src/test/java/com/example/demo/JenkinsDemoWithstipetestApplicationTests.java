package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class JenkinsDemoWithstipetestApplicationTests {
	private static Logger loger=org.slf4j.LoggerFactory.getLogger(JenkinsDemoWithstipetestApplicationTests.class);

	@Test
	public contextLoads() {
		loger.info("Test case executed==============================================");
		assertEquals(true,true);
	}

}
