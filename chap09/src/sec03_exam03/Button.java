package sec03_exam03;

public class Button {
	OnClickListener listener;
	
	
	
	public void setOnClickListner(OnClickListener listner) {
		this.listener = listner;
	}

	void touch() {
		listener.onClick();
	}


	static interface OnClickListener{
		void onClick();
	}
}
