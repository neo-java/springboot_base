package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.domain.User;
import com.example.project.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!!!!";
	}
	
	@RequestMapping("/test")
	public List<User> test() {
		return userService.userService();
	}
}
