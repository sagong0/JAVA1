package sec03_exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("이철의","0194-3780");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("두번째사람", "no number");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
