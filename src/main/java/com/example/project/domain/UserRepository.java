package com.example.project.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository
public class UserRepository {//extends SqlSessionDaoSupport{

//    @Autowired private SqlSession sqlSession;
//
//    public User getUser(String userId) {
//        return (User) getSqlSession().selectOne("com.example.project.mapper.UserMapper.getUser", userId);
//    }
}
