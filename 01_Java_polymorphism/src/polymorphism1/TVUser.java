package polymorphism1;

public class TVUser {

	public static void main(String[] args) {
		// 삼성 TV 사용
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
		// 엘지 TV 사용
		LgTV tv = new LgTV();
		tv.on();
		tv.soundUp();
		tv.soundDown();
		tv.off();
		
/* -> 기능이 똑같은데 메서드명 달리해서 사용 중
	  스프링 사용 이유가 이것!! 통일 목적!!
*/

	}

}
