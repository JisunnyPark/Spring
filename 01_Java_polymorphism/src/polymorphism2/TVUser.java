package polymorphism2;

public class TVUser {

	public static void main(String[] args) {
		// 삼성 TV 사용
		// TV tv = new SamsungTV();
		
		// 엘지 TV 사용 형태로 변경
		TV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
/* -> 기능이 똑같은데 메서드명 달리해서 사용 중
	  스프링 사용 이유가 이것!! 통일 목적!! 결합도 낮춤 목적!!
*/

	}

}
