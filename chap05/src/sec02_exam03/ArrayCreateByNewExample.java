package sec02_exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
//		int을 가지는 배열이름arr1 참조배열 형태의 선언 길이 3개 
		int[] arr1 = new int[3];
		// default값 0 
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1 : " +arr1[i]);
		}
		
		System.out.println("");
		
//		double형 arr2 참조배열 길이 3개
		double[] arr2 = new double[3];
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2 : " + arr2[i]);
		}
		
		System.out.println("");
		
		// 배열 한번 값 할당하면 못바꿈
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i<3; i++) {
			System.out.println("arr2 : " + arr2[i]);
		}
		System.out.println("");
		
//		문자열 배열이름 arr3 참조배열 형태 길이 3개
		String[] arr3 = new String[3];
		for(int i = 0; i <arr3.length; i++) {
			System.out.println("arr3 : " + arr3[i]);
		}
		
		System.out.println("");
		
		arr3[0] ="1월";
		arr3[1] ="2월";
		arr3[2] ="3월";
		for(int i = 0; i <arr3.length; i++) {
			System.out.println("arr3 : " + arr3[i]);
		}
		
		System.out.println("");
		
	}
}
