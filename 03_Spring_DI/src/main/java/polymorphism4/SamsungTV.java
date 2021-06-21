package polymorphism4;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() { // 일반 삼성 티비
		System.out.println(">> SamsungTV 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) { // 소니 스피커 달린 삼성 티비
		System.out.println(">> SamsungTV 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) { // 소니 스피커 달린 삼성 티비의 가격
		System.out.println(">> SamsungTV 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	public SamsungTV(Speaker speaker, int width, int height) { // 소니 스피커 달린 삼성 티비의 폭과 높이
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
	
	// ========== getter, setter 생성 ==========
	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
}











