package test01;

public class SoundableExample {
	
	private static void printSound(Soundable soundable) {
		soundable.Sound();;
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
