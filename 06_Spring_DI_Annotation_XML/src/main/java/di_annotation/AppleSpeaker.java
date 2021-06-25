package di_annotation;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("-->> AppleSpeaker 생성");
	}
	
	public void volumnUp() {
		System.out.println("-->> AppleSpeaker - 소리 크게");
	}
	
	public void volumnDown() {
		System.out.println("-->> AppleSpeaker - 소리 작게");
	}
}
