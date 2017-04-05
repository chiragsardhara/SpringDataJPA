package org.demo.component.service;

import java.util.List;

import org.demo.model.User;

public interface UserService {
	List<User> findAll();
	
	void save(User user);

	void delete(Long id);
}
