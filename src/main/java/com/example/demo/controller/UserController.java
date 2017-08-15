package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.Task;
import com.example.demo.domain.User;
import com.example.demo.services.userservice;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	public userservice us;
	
	public void setUserService(userservice us) {
		this.us=us;
	}
	@RequestMapping(value= {"","/"})
	public String index(Model model) {
		model.addAttribute("activePage","users");
		model.addAttribute("users",this.us.getAllUser());
		return "users/index";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addUserForm(User user,Model model){
	model.addAttribute("activePage","users");
	return "/users/add";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("activePage", "users");
            return "users/add";
        }
        this.us.saveUser(user);
        return "redirect:/users";
	}
	@RequestMapping(value="/edit/{id}")
	public String editUser(@PathVariable Integer id,Model model) {
		model.addAttribute("user",this.us.getUserById(id));
		model.addAttribute("activePage","users");
		return "users/edit";
 	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateUser(User user) {
		this.us.saveUser(user);
		return "redirect:/users";
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteUser(@PathVariable Integer id,User user) {
		this.us.deleteUser(id);
		return "redirect:/users";
	}
	
	
}
