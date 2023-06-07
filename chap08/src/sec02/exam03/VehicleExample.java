package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFair는 안된다  => 캐스팅 (강제 타입변환 필요)
		Bus bus = (Bus) vehicle; // 캐스팅
		bus.run();
		bus.chechkFair();
	}

}
