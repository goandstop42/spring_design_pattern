package me.whiteship.designpatterns._01_creational_patterns._04_builder.moon;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

/*Builder
- 객체가 불완전한 상태로 만들어지는 것을 방지
- 생성자를 매개변수가 장황해줄 수 있는 것을 방지
- 객체 생성 프로세스를 강제할 수 있음
*/
public class App {
	public static void main(String[] args) {
		TourDirector director = new TourDirector(new DefaultTourBuilder());
		TourPlan cancunTripPlan = director.cancunTrip();
		TourPlan longBeachTripPlan = director.loangBeachTrip();
		
	}
}

