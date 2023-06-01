package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
//	abstract  => 함수에 바디 없음
	public abstract void sound();
}
