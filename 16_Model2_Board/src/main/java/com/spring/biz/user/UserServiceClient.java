package com.spring.biz.user;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

public class UserServiceClient {

	public static void main(String[] args) {
		System.out.println("----- 스프링 컨테이너 구동 전 -----");
		
		// 1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서) --> 팩토리 역할
		GenericXmlApplicationContext container 
				= new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("----- 스프링 컨테이너 구동 후 -----");
		
		// 2. 스프링 컨테이너 사용 / BoardService, BoardServiceImpl 둘 다 사용 가능
		UserService userService = (UserService) container.getBean("userService");
		
		// 2-1. 입력
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");				
		
		// 사용자 조회
		UserVO user = userService.getUser(vo);
		System.out.println("user : " + user);
		
		// 3. 스프링 컨테이너 종료(close)
		System.out.println("----- 스프링 컨테이너 종료 처리 -----");
		container.close();
		}
	}












