package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	 @RequestMapping(value = { "", "/", "/home" })
	    public String index(Model model) {
	        model.addAttribute("activePage", "home");
	        return "index";
	}
	
	  
}
