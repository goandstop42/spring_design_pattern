package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator.moon;

import java.time.LocalDateTime;

// 중재자 역할을 하는 FrontDesk는 모든 객체와 의존성이 생김
public class FrontDesk {

	private CleaningSerivce cleaningSerivce = new CleaningSerivce();
	
	private Restaurant restaurant = new Restaurant();
	
	public void getTowers(Guest guest, int numberOfTowers) {
		// Guest에 대한 최소한의 정보만 넘겨서 의존성을 줄인다.
		// Guest에 대한 정보가 필요하면 CleaningSerivce에서 FontDesk에 문의한다.
		cleaningSerivce.getTowers(guest.getId(), numberOfTowers);
	}

	public String getRoomNumberFor(Integer guestId) {
		 
		return "1111";
	}

	public void dinner(Guest guest, LocalDateTime dateTime) {
		restaurant.dinner(guest.getId(), dateTime);
	}
	
}
