package sec02_exam09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java","array","copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		// 원본배열, 시작인덱스, 새배열, 새배열시작인덱스, 복사할 갯수
		
		for(int j=0; j<newStrArray.length; j++) {
			System.out.print(newStrArray[j] + ", ");
		}
	}

}
