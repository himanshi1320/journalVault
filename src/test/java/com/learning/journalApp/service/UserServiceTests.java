package com.learning.journalApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learning.journalApp.entity.User;
import com.learning.journalApp.repository.UserRepository;

@SpringBootTest
public class UserServiceTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JournalEntryService journalEntryService;

	@ParameterizedTest
	@ValueSource(strings= {"ram","third"})
	public void testFindByUserName(String name) {
		assertNotNull(userRepository.findByUserName(name),"failed for: "+name);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,1,2",
		"2,10,12",
	})
	public void test(int a,int b,int expected) {
		assertEquals(expected,a+b);
	}

}
