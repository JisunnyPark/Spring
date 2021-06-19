package polymorphism2;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println(">> SamsungTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원 ON");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV - 전원 OFF");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV - 소리 크게");
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV - 소리 작게");
	}
	
	// -------------------------
	public void initMethod() {
		System.out.println("LgTV - initMethod() 실행");
	}
	
	public void destroyMethod() {
		System.out.println("LgTV - destroyMethod() 실행");
	}
}
