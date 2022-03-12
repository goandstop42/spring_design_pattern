package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator.moon;

import java.time.LocalDateTime;

public class Restaurant {
	
	private FrontDesk frontDesk = new FrontDesk();

	public void dinner(Integer guestId, LocalDateTime dateTime) {
		String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
		System.out.println("serve dinner" + " for " + roomNumber);
	}

	public void clean() {
		
	}

}
