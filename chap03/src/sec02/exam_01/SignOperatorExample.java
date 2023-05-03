package sec02.exam_01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
//		byte result3 = -b;  -붙혀서 int 로 자동변환 missmatch
		int result3 = -b;
		System.out.println("result3= "+ result3);
	}

}
