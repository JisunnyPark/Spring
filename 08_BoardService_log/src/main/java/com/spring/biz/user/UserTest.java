package com.spring.biz.user;

import java.util.List;

import com.spring.biz.user.impl.UserDAO;

public class UserTest {

	public static void main(String[] args) {
		UserVO vo = new UserVO();
		vo.setId("test3");
		vo.setPassword("test3");
		vo.setName("홍길동3");
		vo.setRole("user3");
		
		UserDAO dao = new UserDAO();
		dao.insertUser(vo);
		
		List<UserVO> list = dao.getUserList();
		
		for(UserVO user : list) {
			System.out.println(user);
		}
		

	}

}
