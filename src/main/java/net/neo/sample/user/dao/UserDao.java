package net.neo.sample.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.neo.sample.dao.NeoDao;
import net.neo.sample.user.dto.UserDto;

@Repository
public class UserDao extends NeoDao {

	public List<UserDto> selectUserInfoList(UserDto userDto) {

		return getSqlSession().selectList("net.neo.mapper.user.selectUserInfoList", userDto);
	}
}
