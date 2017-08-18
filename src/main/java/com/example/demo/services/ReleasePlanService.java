package com.example.demo.services;

import com.example.demo.domain.ReleasePlan;

public interface ReleasePlanService {

	Iterable<ReleasePlan> getAllReleasePlan();
	void deleteReleasePlan(int id);
	
}
