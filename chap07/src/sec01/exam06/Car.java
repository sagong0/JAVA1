package sec01.exam06;

public class Car {
	// field
	public int speed;
	
	// method
	public void speedUp() {
		speed += 1;
	}
	
	// final method  => final은 오버라이드 불가능 
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
