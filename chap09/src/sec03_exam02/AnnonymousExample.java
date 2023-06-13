package sec03_exam02;

public class AnnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		// 익명객체 필드의 메소드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		
		// 익명객체 로컬변수사용
		anony.method1();
		//익명객체 매게값 사용
		anony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("Smart TV 를 켭니다.");
					}

					@Override
					public void turnOff() {
						System.out.println("Smart TV 를 끕니다 ~ ");
					}
			}
		);
	}

}
