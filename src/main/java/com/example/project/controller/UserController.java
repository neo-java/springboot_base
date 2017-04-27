package com.example.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.UserDto;
import com.example.project.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!!!!";
	}
	
//	@RequestMapping("/test")
//	public List<User> test() {
//		return userService.userService();
//	}
//	
	@RequestMapping("/userlist")
	public Map<String, Object> userList() {

		UserDto userDto = new UserDto();
		
		List<UserDto> userInfoList = userService.selectUserInfoList(userDto);
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("data", userInfoList);
		return dataMap;

	}
	
	@RequestMapping("/user")
	public Map<String, Object> user() {

		UserDto userDto = new UserDto();
		userDto.setId("1");
		UserDto abcDto = new UserDto();
		abcDto = userService.selectUserInfo(userDto);
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("data", abcDto);
		return dataMap;

	}
}
