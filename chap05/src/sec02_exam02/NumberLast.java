package sec02_exam02;

import java.util.Scanner;

public class NumberLast {

	public static void main(String[] args) {
		boolean run = true;		
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
		
        while(run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

            int num = scanner.nextInt();

            if(num==1) {
                System.out.print("예금액>");
                balance= balance + scanner.nextInt();
            } else if(num==2) {
                System.out.print("출금액>");
                balance= balance - scanner.nextInt();
            } else if(num==3) {
                System.out.print("잔고>");
                System.out.println(balance);
            } else if(num==4) { 
                break;
            }

            System.out.println();
        }	
            System.out.println("프로그램 종료");
	}

}
