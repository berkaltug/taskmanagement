package com.example.demo.services;

import com.example.demo.domain.User;

public interface userservice {

	Iterable<User> getAllUser();
	User saveUser(User u);
	void deleteUser(int id);
	User getUserById(int id);
}
