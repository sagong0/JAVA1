package sec02_exam02;

public class tettttest {

	public static void main(String[] args) {
		int eye1 = (int)(Math.random()*6) + 1;
		int	eye2 = (int)(Math.random()*6) + 1;
		
		int total = eye1 + eye2;
		
		while(total != 5) {
			eye1 = (int)(Math.random()*6) + 1;
			eye2 = (int)(Math.random()*6) + 1;
			total = eye1 + eye2;
		}
		
		
		System.out.println(total);
	}

}
