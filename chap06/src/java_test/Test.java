package java_test;

public class Test {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 11; i++) {
			if(i < 10) {
				System.out.print(i + "+");
				sum += i;
			}
			
			
			if(i == 10) {
				sum +=i;
				System.out.print(i + "=" + sum);
			}
		}
	}
}
