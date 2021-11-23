package com.jobae.demo.store.lolgic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.jobae.demo.entity.User;
import com.jobae.demo.store.UserStore;

@Repository
public class UserStoreLogic implements UserStore {

	private Map<String,User> userMap;
	
	public UserStoreLogic() {
		this.userMap = new HashMap<>();
	}
	@Override
	public String create(User newUser) {
		// TODO Auto-generated method stub
		this.userMap.put(newUser.getId(),newUser);
		return newUser.getId();
	}

	@Override
	public void update(User newUser) {
		// TODO Auto-generated method stub
		this.userMap.put(newUser.getId(), newUser);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.userMap.remove(id);
	}

	@Override
	public User retrieve(String id) {
		// TODO Auto-generated method stub
		
		return this.userMap.get(id);
	}

	@Override
	public List<User> retrieveAll() {
		// TODO Auto-generated method stub
		return this.userMap.values().stream().collect(Collectors.toList());
	}

}
