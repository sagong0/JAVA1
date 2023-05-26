package sec06_exam02.myCompany;

import sec06_exam02.hankook.*; // Tire, ShowTire
import sec06_exam02.kumho.*; // BigWidthTire, Tire
import sec06_exam02.hyundai.Engine; // Engine

public class Car {
	Engine engine = new Engine();
	ShowTire tire1 = new ShowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
//	Tire tire3 = new Tire();
	sec06_exam02.hankook.Tire tire3 = new sec06_exam02.hankook.Tire();
	sec06_exam02.kumho.Tire tire4 = new sec06_exam02.kumho.Tire();
}







