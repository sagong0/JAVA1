package sec01.exam07.pack02;

import sec01.exam07.pack01.A;

public class D extends A{
	// protected 다른 패키지이지만 상속이라 가능
	
	public D(){
		super();
		this.field = "value";
		this.method();
	}
}
