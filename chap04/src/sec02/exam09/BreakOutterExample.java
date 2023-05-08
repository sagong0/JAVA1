package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
		// Outter >> break문 만나면 전체 다 빠져나오도록.
		Outter:
			for(char upper='A'; upper <= 'Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-" + lower);
					if(lower == 'g') {
						break Outter;
					}
				}
			}
		System.out.println("프로그램 실행 종료");
	}

}
