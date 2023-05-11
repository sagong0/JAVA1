package sec02_exam01;

public class ArrayCreateValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 }; // 선언과 동시에 값을 할당.
//		int[] scores1;
//		scores1 = {0,2,23}; 변수처럼 먼저 선언 후 나중에 값 할당 안됨.
		int[] scores1;
		scores1 = new int[]{1,2,3,41}; // 위와 같은데 참조변수 선언하듯 값 할당 가능.
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
