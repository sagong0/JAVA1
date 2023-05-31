package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
//		부모 클래스의 타입변환이 이루어져 child에서 정의된 method3는 사용 불가능
//		parent.method3();
		
	}

}
