package test08;

public class Button {
	public static interface OnClickListener{
		void touch();
	}
	
	private OnClickListener listener;

	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
}
