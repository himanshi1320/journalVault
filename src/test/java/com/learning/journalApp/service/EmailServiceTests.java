package com.learning.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
	
	@Autowired
	private EmailService emailService;
	
	@Test
	void testSendMail() {
		emailService.sendEmail("himanshi1320tyagi@gmail.com",
				"Alertttttttttt",
				"Hiii, This is the time to pack your bags and move to your homes");
	}

}
