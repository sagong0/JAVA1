package test10;

public class Button {
	OnClickListener listener;

	// 자동형변환 / 다형성
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}


	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}	
}
