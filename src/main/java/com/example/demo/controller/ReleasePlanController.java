package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.ReleasePlanService;

@Controller
@RequestMapping("/ReleasePlans")
public class ReleasePlanController {

	private ReleasePlanService rps;
	
	public void setReleasePlanService(ReleasePlanService rps) {
		this.rps=rps;
	}
	
	@RequestMapping(value= {"","/"})
	public String index(Model model) {
		model.addAttribute("activePage","ReleasePlans");
		model.addAttribute("ReleasePlan",this.rps.getAllReleasePlan());
		return "ReleasePlans/index";
	}
	
	@RequestMapping(value= {"/delete/{id}"})
		public String deletePlan(@PathVariable Integer id) {
		this.rps.deleteReleasePlan(id);
		return "redirect:/ReleasePlans";
	}
	
}
