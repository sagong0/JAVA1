package sec03_exam01;

public class AnnonymousExample {

	public static void main(String[] args) {
		Annonymous anony = new Annonymous();
		
		// 익명객체 필드 사용
		anony.field.wake();
		// 익명객체 로컬변수 사용
		anony.method1();
		// 익명 객체 매개값으로 사용
		anony.method2(
				new Person() {
					void study() {
						System.out.println("매개값이 공부합니다..");
					}

					@Override
					void wake() {
						System.out.println("매개값으로 6시에 일어납니다.");
						study();
					}
				}
		);
	}

}
