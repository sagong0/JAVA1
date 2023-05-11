package sec02_exam10;

public class AdvamcedFprExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
//		JAVA for문(scores는 배열변수명, a는 변수명) 
		for(int a : scores) {
			sum = sum + a;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
