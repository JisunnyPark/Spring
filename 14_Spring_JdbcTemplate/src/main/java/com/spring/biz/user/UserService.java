package com.spring.biz.user;

import java.util.List;

public interface UserService {
	void insertUser(UserVO vo);
	UserVO getUser(UserVO vo);
	List<UserVO> getUserList();
}
