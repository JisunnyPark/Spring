package polymorphism2;

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() { // 일반 삼성 티비
		System.out.println(">> SamsungTV 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) { // 소니 스피커 달린 삼성 티비
		System.out.println(">> SamsungTV 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) { // 소니 스피커 달린 삼성 티비의 가격
		System.out.println(">> SamsungTV 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public SamsungTV(SonySpeaker speaker, int width, int height) { // 소니 스피커 달린 삼성 티비의 폭과 높이
		System.out.println(">> SamsungTV 객체 생성");
		this.speaker = speaker;
		this.width = width;
		this.height = height;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원 ON");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV - 전원 OFF");
	}
	
	public void volumeUp() {
		System.out.println("SamsungTV - 소리 크게");
		speaker.volumnUp();
	}
	
	public void volumeDown() {
		System.out.println("SamsungTV - 소리 작게");
		speaker.volumnDown();
	}

	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
}
