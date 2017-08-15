package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.services.userservice;
import com.example.demo.repository.userrepository;
import com.example.demo.domain.User;

@Service
public class userserviceimpl implements userservice{
	
	private userrepository ur;
	
	@Autowired
	public void setUserRepository(userrepository ur) {
		this.ur=ur;
	}
	
	@Override
	public Iterable<User> getAllUser(){
		return this.ur.findAll();
	}
	
	@Override
	public User saveUser(User user) {
		return this.ur.save(user);
	}
	
	@Override
	public void deleteUser(int id) {
		this.ur.delete(id);
	}
	
	@Override
	public User getUserById(int id) {
		return this.ur.findOne(id);
	}
}
