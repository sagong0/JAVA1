package sec01_exam02;

class Name{
	static void print() {  // static method
		System.out.println("내 이름은 홍길동입니다.");
	}
	void print2() { // instance method
		System.out.println("내 이름은 이순신 입니다.");
	}
	
}

public class StaticExample {

	public static void main(String[] args) {
		Name.print(); // 인스턴스를 생성하지 않아도 호출이 가능
		
		Name name = new Name(); //인스턴스 생성
		name.print2(); // 인스턴스를 생성해야만 호출이 가능
	}

}
