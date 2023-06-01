package sec03.exam02;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍멍ㅁ엄엄어머엄ㅇ멈엄엄엄엄ㅇ멍멍");
	}
	
}
