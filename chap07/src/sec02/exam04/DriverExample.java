package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
//		extends vehicle
		Bus bus = new Bus();
//		extends vehicle
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		 Vehicle vehicle = bus ; // 자동타입변환
	}

}
