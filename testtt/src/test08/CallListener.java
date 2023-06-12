package test08;

public class CallListener implements Button.OnClickListener{

	@Override
	public void touch() {
		System.out.println("전화를 겁니다.");
	}

}
