package sec02_exam02;

import java.util.Scanner;

public class NumberSeven {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i=1; i<11; i++) {
			total = total + i;
			
			System.out.print(i);
			
			if(i != 10) {
				System.out.print("+");
			}
		}
		System.out.println("= " + total);
	}

}
