package sec02.exam03;

public class HankookTire extends Tire{
//	부모 생성자 자동 호출되어
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명: " + (maxRotation - accumulatedRotation) + '회');
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		
	}
	
	}	
}
