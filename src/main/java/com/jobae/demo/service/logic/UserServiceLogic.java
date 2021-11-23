package com.jobae.demo.service.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobae.demo.entity.User;
import com.jobae.demo.service.UserService;
import com.jobae.demo.store.UserStore;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceLogic implements UserService {

	private final UserStore userStore;
	
	@Override
	public String register(User newUser) {
		// TODO Auto-generated method stub
		return this.userStore.create(newUser);
	}

	@Override
	public void modify(User newUser) {
		// TODO Auto-generated method stub
		this.userStore.update(newUser);
	}

	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub
		this.userStore.delete(id);
	}

	@Override
	public User find(String id) {
		// TODO Auto-generated method stub
		return this.userStore.retrieve(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userStore.retrieveAll();
	}

}
