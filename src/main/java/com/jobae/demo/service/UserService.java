package com.jobae.demo.service;

import java.util.List;

import com.jobae.demo.entity.User;

public interface UserService {
	String register(User newUser);
	void modify(User newUser);
	void remove(String id);
	
	User find(String id);
	List<User> findAll();
}
