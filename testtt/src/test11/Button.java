package test11;

public class Button {
	OnClickListener listener;
	
	
	public void onClickSetListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
