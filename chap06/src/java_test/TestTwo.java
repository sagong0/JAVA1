package java_test;

public class TestTwo {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0; i<6; i++) {
			if(i == 1) {
				System.out.println("*");
			}else if(i == 2) {
				System.out.println("**");
			}else if(i == 3) {
				System.out.println("***");
			}else if(i == 4) {
				System.out.println("****");
			}else if(i == 5) {
				System.out.println("*****");
			}
		}
	}

}
