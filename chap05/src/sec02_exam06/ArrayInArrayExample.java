package sec02_exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i =0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"][" +k+"]="+ mathScores[i][k]);
			}
		}
		
		System.out.println("-------------------------");
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i =0; i<englishScores.length; i++) {
			for(int k = 0; k < englishScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" +k + "]=" + englishScores[i][k]);
			}
		}
		// 1행 2열에 50넣기
		englishScores[0][1] = 50;
		System.out.println(englishScores[0][1]);
	}
}
