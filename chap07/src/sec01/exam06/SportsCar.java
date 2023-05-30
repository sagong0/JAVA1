package sec01.exam06;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop() {
//		System.out.println("stop 메소드는 final이라 재정의 안됩니다.");
//	}
	
}
