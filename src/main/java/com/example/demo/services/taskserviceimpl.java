package com.example.demo.services;

import com.example.demo.domain.Task;
import com.example.demo.repository.*;
import com.example.demo.services.taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class taskserviceimpl implements taskservice {
	
	private taskrepository tr;
	
	@Autowired
	public void setTaskRepository(taskrepository tr) {
		this.tr=tr;
	}
	@Override
	public Iterable<Task> getAllTask(){
		return this.tr.findAll();
	}
	@Override
	public Task getTaskById(int id) {
		return this.tr.findOne(id); 
	}
	@Override
	public void deleteTask(int id) {
		this.tr.delete(id);
	}
	@Override
	public Task saveTask(Task tk) {
		return this.tr.save(tk);
	}
	
}
