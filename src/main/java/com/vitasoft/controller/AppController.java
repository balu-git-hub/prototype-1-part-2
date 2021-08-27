package com.vitasoft.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vitasoft.model.UserDetails;
import com.vitasoft.service.UserService;


@Controller
public class AppController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index() {	
		return "index";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(Model model) {
		model.addAttribute("user", new UserDetails());
		return "register";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String uname, @RequestParam String psw) {
		
		return "after_login";
	}
	
	@RequestMapping("/read-details")
	public String show_all_uesr(Model model) {
		model.addAttribute("user", userService.findAll());
		return "all_user";
	}
	
	@RequestMapping(value = "/storeUser", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("user") UserDetails user) {
		userService.saveContact(user);
		return "redirect:/read-details";
	}
	
	@RequestMapping(value = "/delete-user/{id}",method = RequestMethod.GET)
	public String delete_user(@PathVariable int id) {
		userService.deleteById(id);
		return "redirect:/read-details";
	}
	
}
