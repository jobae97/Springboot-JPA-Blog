package com.jobae.demo.store;

import java.util.List;

import com.jobae.demo.entity.User;

public interface UserStore {
	String create(User newUser);
	void update(User newUser);
	void delete(String id);
	
	User retrieve(String id);
	List<User> retrieveAll();
}
