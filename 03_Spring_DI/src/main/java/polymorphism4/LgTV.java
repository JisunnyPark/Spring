package polymorphism4;

public class LgTV implements TV {
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
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV - 소리 작게");
		
	}
}
