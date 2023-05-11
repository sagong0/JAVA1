package sec02_exam02;

public class NumberFive {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		for(int i = 0; i<11; i ++) {
			for(int j = 0; j < 11; j++) {
				x = i * 4;
				y = j * 5;
				if(x + y == 60) {
					System.out.println("x : " + x);
					System.out.println("y : " + y);
					break;
				}
			}
		}
	}

}
