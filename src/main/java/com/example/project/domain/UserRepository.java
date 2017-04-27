package com.example.project.domain;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

//@Repository("userRepository")
public class UserRepository extends SqlSessionDaoSupport{

	public List<User> user (){
		return getSqlSession().selectList("select * from auth_group");
	}
}
