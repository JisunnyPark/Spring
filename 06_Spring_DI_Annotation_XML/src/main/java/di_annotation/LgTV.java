package di_annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

// 객체 생성을 요청하는 어노테이션
@Component // lgTV 명칭으로 객체 생성(클래스명 첫 글자 소문자)
public class LgTV implements TV {
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println(">> LgTV 객체 생성");
	}
	
	public void on() {
		System.out.println("LgTV - 전원 ON");
	}
	
	public void off() {
		System.out.println("LgTV - 전원 OFF");
	}
	
	public void soundUp() {
		System.out.println("LgTV - 소리 크게");
	}
	
	public void soundDown() {
		System.out.println("LgTV - 소리 작게");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원 ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원 OFF");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV - 소리 크게");
		speaker.volumnUp();
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV - 소리 작게");
		speaker.volumnDown();
		
	}
}
