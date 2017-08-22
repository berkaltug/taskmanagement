package com.example.demo.services;

import com.example.demo.domain.ReleasePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.*;
import com.example.demo.services.ReleasePlanService;

@Service
public class ReleasePlanServiceImpl implements ReleasePlanService {
	
	private ReleasePlanRepository rpr ;
	
	@Autowired
	public void setReleasePlanRepository(ReleasePlanRepository rpr) {
		this.rpr=rpr;
	}
	
	@Override
	public void deleteReleasePlan(String id) {
		this.rpr.delete(id);
	}
	@Override
	public Iterable<ReleasePlan> getAllReleasePlan() {
		return this.rpr.findAll();
	}
}
