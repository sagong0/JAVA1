package sec02_exam02;

public class NumberSix {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 0; i < 6; i++) {
			total = i;
			if(total == 1) {
				System.out.println("*");
			}else if (total == 2){
				System.out.println("**");
			}else if(total == 3) {
				System.out.println("***");
			}else if(total == 4) {
				System.out.println("****");
			}else if(total == 5) {
				System.out.println("****");
			}
		}
	}
}
