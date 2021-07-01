package com.spring.biz.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.biz.common.JDBCUtil;
import com.spring.biz.user.UserVO;

public class UserDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// SQL문
	private final String USER_INSERT
		= "INSERT INTO USERS (ID, PASSWORD, NAME, ROLE) "
		+ "VALUES (?, ?, ?, ?)";
	
	private final String USER_GET
		= "SELECT * FROM USERS WHERE ID = ? AND PASSWORD = ?";
	
	private final String USER_LIST
		= "SELECT * FROM USERS ORDER BY ID";
	
	public UserDAOSpring() {
		System.out.println(">> UserDAOSpring() 객체 생성");
	}
	
	// 유저 추가
	public void insertUser(UserVO vo) {
		System.out.println("===> Spring JDBC로 insertUser() 실행");
		
		jdbcTemplate.update(USER_INSERT, 
				vo.getId(), vo.getPassword(), 
				vo.getName(), vo.getRole());
	}
	
	public UserVO getUser(UserVO vo) {
		System.out.println("===> Spring JDBC로 getUser() 실행");
		
		Object[] args = { vo.getId(), vo.getPassword() };
		return jdbcTemplate.queryForObject(USER_GET, args, new UserRowMapper());
	}
	public List<UserVO> getUserList() {
		System.out.println("===> Spring JDBC로 getUserList() 실행");
		
		return jdbcTemplate.query(USER_LIST, new UserRowMapper());
		
	
	}
}
