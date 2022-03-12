package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator.moon;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Guest {

	private Integer id;
	
	private FrontDesk frontDesk = new FrontDesk();
	
	public void getTowers(int numberOfTowers) {
		this.frontDesk.getTowers(this, numberOfTowers);
	}
	
	public void dinner(LocalDateTime dateTime) {
		this.frontDesk.dinner(this, dateTime);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void dinner() {
	}

	
}
