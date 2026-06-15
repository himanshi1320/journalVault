package com.learning.journalApp.service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learning.journalApp.scheduler.UserScheduler;

@SpringBootTest
public class UserSchedulerTest {

	
	@Autowired
	private UserScheduler userScheduler;
	
	@Test
	public void testFetchUsersAndSendMail() {
		userScheduler.fetchUsersAndSendMail();
	}
}
