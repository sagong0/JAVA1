package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
	
//		parent.field2 = "data2";   (X)
//		parent.method3();          (X)
		
		// 강제 형변환
		Child child = (Child) parent;
		child.field2 = "다시돌아온 child";  // ( O )
		child.method3();				// ( O )
	}

}
