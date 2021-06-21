package polymorphism1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		System.out.println("----- 스프링 컨테이너 구동 전 -----");
		
		// 1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서) --> 팩토리 역할
		GenericXmlApplicationContext factory 
				= new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("----- 스프링 컨테이너 구동 후 -----");
		
		// 2. 스프링 컨테이너 사용
		System.out.println("--- tv 요청 사용 ---");
		TV tv = (TV) factory.getBean("tv1");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. 스프링 컨테이너 종료(close)
		System.out.println("----- 스프링 컨테이너 종료 처리 -----");
		factory.close();
	}

}
