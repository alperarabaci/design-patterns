package com.company.intersegrega.servicev2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.company.intersegrega.entity.User;

//Stores User entities
public class ISUserPersistenceService implements ISPersistenceService<User>{
	
	private static final Map<Long, User> USERS = new HashMap<>();
	
	@Override
	public void save(User entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(User entity) {
		synchronized (USERS) {
			USERS.remove(entity.getId());
		}
	}

	@Override
	public User findById(Long id) {
		synchronized (USERS) {
			return USERS.get(id);
		}
	}
	
	//just remove Override annotation, implement Override yourself
	//without any commitment
	//@Override
	public List<User> findByName(String name) {
		synchronized (USERS) {
			return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}

}
