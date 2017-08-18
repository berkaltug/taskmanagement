package com.example.demo.services;

import com.example.demo.domain.Task;

public interface taskservice {

	Iterable<Task> getAllTask();
	Task saveTask(Task tk);
	void deleteTask(int id);
	Task getTaskById(int id);
	Task updateTask(Task tk);   
}

