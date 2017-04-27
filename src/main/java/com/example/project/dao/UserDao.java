package com.example.project.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.project.dto.UserDto;

@Repository
public class UserDao extends NeoDao {

	public List<UserDto> selectUserInfoList(UserDto userDto) {

		return getSqlSession().selectList("selectUserInfoList", userDto);
//		return getSqlSession().selectList("net.neo.mapper.user.selectUserInfoList", userDto);
	}
	
	public UserDto selectUserInfo(UserDto userDto) {

		return getSqlSession().selectOne("selectUserInfo", userDto);
//		return getSqlSession().selectList("net.neo.mapper.user.selectUserInfoList", userDto);
	}
}
