package com.learning.journalApp.service;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ActiveProfiles;

import com.learning.journalApp.entity.User;
import com.learning.journalApp.repository.UserRepository;

@ActiveProfiles("dev")
public class UserDetailsServiceImplTests {

	@InjectMocks
	private UserDetailsServiceImpl userDetailsService;

	@Mock
	private UserRepository userRepository;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void loadUserByUsernameTest() {
		when(userRepository.findByUserName(ArgumentMatchers.anyString()))
				.thenReturn(User.builder().userName("ram").password("ram").roles(new ArrayList<>()).build());
		UserDetails user = userDetailsService.loadUserByUsername("third");
		Assertions.assertNotNull(user);

	}

}
