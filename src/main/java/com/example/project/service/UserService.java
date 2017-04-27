package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.User;
import com.example.project.domain.UserRepository;
import com.example.project.dto.UserDto;


public interface UserService {

	public List<UserDto> selectUserInfoList(UserDto userDto);
	public UserDto selectUserInfo(UserDto userDto);
}
