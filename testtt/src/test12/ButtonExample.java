package test12;

public class ButtonExample {

	public static void main(String[] args) {
		Button myButton = new Button();
		myButton.setOnClickListener(new MessageListener());
		myButton.touch();
		
		myButton.setOnClickListener(new CallListener());
		myButton.touch();
	}                     
}
