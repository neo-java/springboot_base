package net.neo.sample.user.service;

import java.util.List;

import net.neo.sample.user.dto.UserDto;

public interface UserService {

	public List<UserDto> selectUserInfoList(UserDto userDto);
	
}
