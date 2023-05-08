package sec02.exam05;

public class forMultiplicationTableExample {

	public static void main(String[] args) {
		for(int m = 2; m < 10; m++) {
			System.out.println("***" + m + "단 ***");
			for(int n =1; n<10; n++) {
				System.out.println(m+ "x" + n + "=" + (m*n));
			}
		}
	}

}
