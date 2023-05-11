package sec03_exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 내가만든 자료형 (enum) : Week
		Week today = null;
		
		// 오늘의 년월일시---------------쭉 cal에담김
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
			break;
			case 2:
				today = Week.MONDAY;
			break;
			case 3:
				today = Week.TUESDAY;
			break;
			case 4:
				today = Week.WEDNESDAY;
			break;
			case 5:
				today = Week.THURSDAY;
			break;
			case 6:
				today = Week.FRIDAY;
			break;
			case 7:
				today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 잠은 6시간 잔다");
		}else if(today == Week.MONDAY) {
			System.out.println("월요일 입니다.");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일 입니다.");
		}else if(today == Week.WEDNESDAY) {
			System.out.println("수요일 입니다.");
		}else if(today == Week.THURSDAY) {
			System.out.println("목요일 입니다.");
		}else if(today == Week.FRIDAY) {
			System.out.println("금요일 입니다.");
		}else {
			System.out.println("토요일~~");
		}
	}

}
