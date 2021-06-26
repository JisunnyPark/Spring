package di_annotation;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("-->> SonySpeaker 생성");
	}
	
	public void volumnUp() {
		System.out.println("-->> SonySpeaker - 소리 크게");
	}
	
	public void volumnDown() {
		System.out.println("-->> SonySpeaker - 소리 작게");
	}
}




















