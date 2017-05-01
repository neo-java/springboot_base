package com.example.project.service;

import java.util.List;

import com.example.project.mapper.CompanyMapper;
import com.example.project.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.User;

@Service
public class UserService {

	@Autowired private UserMapper userMapper;
    @Autowired private CompanyMapper companyMapper;

	public List<User> userService () {
		System.out.println("service");

        companyMapper.getTime();
        userMapper.getTime();
        userMapper.getCurrentDateTime();

		return null;
	}
}
