package com.example.project.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends CommonRepository{

	public List<User> user (){
		return getSqlSession().selectList("select * from auth_group");
	}
}
