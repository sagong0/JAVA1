package sec01.exam07.pack01;

public class B {
	public void method() {
		
//		protected => 같은패키지라 사용가능 
		
		A a = new A();
		a.field = "value";
		a.method();
	}
}
