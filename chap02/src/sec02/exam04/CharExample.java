package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
//		char c1 = 'A';	 char 변수타입은 작은따옴표 (큰 따옴표 X)
		char c1 = 'A';	// 문자를 직접 저장
		char c2 = 65;	// 십진수로 저장
		char c3 = '\u0041';	// 16진수로 저장
		
		char c4 = '가';	// 문자를 직접 저장
		char c5 = 44032;	// 10진수로 저장
		char c6 = '\uac00'; // 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
