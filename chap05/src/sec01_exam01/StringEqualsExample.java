package sec01_exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "이철의";
		String strVar2 = "이철의";
		
		if(strVar1 == strVar2) {
			System.out.println("strVal1과 strVal2가 참조가 같습니다.");
		}else {
			System.out.println("strVal1과 strVal2가 참조가 틀립니다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("1과 2가 문자열이 같음");
		}
		
		String strVar3 = new String("이철의");
		String strVar4 = new String("이철의");
		
		if(strVar3 == strVar4) {
			System.out.println("strVal1과 strVal2가 참조가 같습니다.");
		}else {
			System.out.println("strVal1과 strVal2가 참조가 틀립니다.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("1과 2가 문자열이 같음");
		}
	}
}
