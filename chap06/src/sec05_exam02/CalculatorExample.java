package sec05_exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.plus(10, 5);
		
		System.out.println("result 1 : " + result1);
		System.out.println("result 2 : " + result2);
		System.out.println("result 3 : " + result3);
	}
}
