package com.example.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.dao.UserDao;
import com.example.project.dto.UserDto;
import com.example.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserDto> selectUserInfoList(UserDto userDto) {
		return userDao.selectUserInfoList(userDto);
	}

	@Override
	public UserDto selectUserInfo(UserDto userDto) {
		return userDao.selectUserInfo(userDto);
	}
}