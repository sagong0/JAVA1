package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2+ value3;
//		가장 큰 long 으로 변환되어 byte는 오류
//		byte result2 = value1 + value2+ value3;
		System.out.println(result);

	}

}
