package sec01.exam04;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		SupersocinAirPlane sa = new SupersocinAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersocinAirPlane.SUPERSONIC;
		
		sa.fly();
		sa.flyMode = SupersocinAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}

}
