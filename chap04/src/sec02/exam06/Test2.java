package sec02.exam06;

public class Test2 {

	public static void main(String[] args) {
		int total = 0;
//		while(i<10) { // i = 9
//			i++;
//			total +=i;
//			System.out.print(i);
//			if(i != 10) {
//				System.out.print("+");
//			}
//		}
//		System.out.println("=" + total);
		
		
//		이거 시험
		for(int i=1; i<11; i++) {
			total += i;
			
			System.out.print(i);
			
			if(i != 10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}
}
