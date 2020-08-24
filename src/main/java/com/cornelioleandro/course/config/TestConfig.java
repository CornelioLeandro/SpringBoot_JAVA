package com.cornelioleandro.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cornelioleandro.course.entities.User;
import com.cornelioleandro.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1= new User(null, "Leandro Cornelio", "cornelio@gmail.com", "981301912","125874");
		User u2= new User(null, "Clber Cornelio", "clber@gmail.com", "981301912","125874");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
