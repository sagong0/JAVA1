package test08;

public class ButtonExample {

	public static void main(String[] args) {
		Button myButton = new Button();
		myButton.setListener(new CallListener());
		
		CallListener callListener = new CallListener();
		callListener.touch();
	}

}
