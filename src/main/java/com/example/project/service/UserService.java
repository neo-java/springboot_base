package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.User;
import com.example.project.domain.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userDao;
	
	public List<User> userService () {
		System.out.println("service");
		
		return (List<User>) userDao.getUser();
	}
}
