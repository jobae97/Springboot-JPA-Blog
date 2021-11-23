package com.jobae.demo.service.logic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jobae.demo.entity.User;
import com.jobae.demo.service.UserService;

@SpringBootTest
public class UserServiceLogicTest {

	@Autowired
	private UserService userService;
	
	public User kim;
	public User lee;
	
	@BeforeEach
	public void startUp() {
		this.kim = new User("Kim","kim@tjlogis.co.kr");
		this.lee = new User("Lee","lee@tjlogis.co.kr");
		this.userService.register(kim);
		this.userService.register(lee);
	}
	
	@Test
	public void reigisterTest() {
		User sample = User.sample();
		this.userService.register(sample);
		assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
		assertThat(this.userService.findAll().size()).isEqualTo(3);
		this.userService.remove(sample.getId());
	}
	
	@Test
	public void find() {
		assertThat(this.userService.find(lee.getId())).isNotNull();
		assertThat(this.userService.find(lee.getId()).getEmail()).isEqualTo(lee.getEmail());
	}
	
	@AfterEach
	public void cleanUp() {
		this.userService.remove(kim.getId());
		this.userService.remove(lee.getId());
		
	}
}
