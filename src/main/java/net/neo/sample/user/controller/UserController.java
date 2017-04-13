package net.neo.sample.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.neo.sample.user.dto.UserDto;
import net.neo.sample.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	public String home() {

		return "Hello World!";

	}

	@RequestMapping("/userlist")
	public Map<String, Object> userList() {

		UserDto userDto = new UserDto();
		
		List<UserDto> userInfoList = userService.selectUserInfoList(userDto);
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("data", userInfoList);
		return dataMap;

	}
}
