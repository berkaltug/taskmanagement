package com.example.demo.controller;


import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import com.example.demo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import com.example.demo.services.taskservice;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;




@Controller
@RequestMapping("/tasks")
public class TaskControllerController {
	
	public taskservice taskservice;
	
	@Autowired
	public void setTaskService(taskservice taskservice) {
		this.taskservice=taskservice;	
	}
	
	@RequestMapping(value = { "", "/" })
    public String index(Model model) {
        model.addAttribute("activePage", "tasks");
        model.addAttribute("tasks", this.taskservice.getAllTask());
        
        return "tasks/index";
    }
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addTaskForm(Task task,Model model) {
		model.addAttribute("activePage", "tasks");
        return "tasks/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@Valid Task task, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("activePage", "tasks");
            return "tasks/add";
        }
        this.taskservice.saveTask(task);
        return "redirect:/tasks";
	}
	
	@RequestMapping(value = "/view/{id}")
    public String viewTask(@PathVariable Integer id, Model model) {
        model.addAttribute("task", this.taskservice.getTaskById(id));
        model.addAttribute("activePage", "tasks");
        return "tasks/view";
    }
	
	@RequestMapping(value = "/edit/{id}")
    public String editTask(@PathVariable Integer id, Model model) {
        model.addAttribute("task", this.taskservice.getTaskById(id));
        model.addAttribute("activePage", "tasks");
        return "tasks/edit";
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateTask(Task task) {
//        System.out.println("Contact ID: " + task.getId());
        this.taskservice.saveTask(task);
        return "redirect:/tasks/view/" + task.getId();
    }
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteTask(@PathVariable Integer id) {
        this.taskservice.deleteTask(id);
        return "redirect:/tasks";
    }
//	@InitBinder
//    public void initBinder (WebDataBinder binder) {
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true));
//    }
}
