package sec02_exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		
		int sum = 0;
		for(int i=0; i< scores.length; i++) {
			sum += scores[i];
		}
		// 배열의 갯수는 한번 결정되면 바꿀 수 X
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
