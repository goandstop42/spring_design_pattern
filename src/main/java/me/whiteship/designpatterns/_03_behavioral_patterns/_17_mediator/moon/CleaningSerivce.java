package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator.moon;

public class CleaningSerivce {

	private FrontDesk frontDesk = new FrontDesk();
	
	public void getTowers(Integer guestId, int numberOfTowers) {
		String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
		System.out.println("provide " + numberOfTowers + " to " + numberOfTowers);
	}

}
