package net.neo.sample.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.neo.sample.user.dao.UserDao;
import net.neo.sample.user.dto.UserDto;
import net.neo.sample.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserDto> selectUserInfoList(UserDto userDto) {
		return userDao.selectUserInfoList(userDto);
	}

	
}
