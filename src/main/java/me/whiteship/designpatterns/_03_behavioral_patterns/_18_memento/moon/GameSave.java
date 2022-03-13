package me.whiteship.designpatterns._03_behavioral_patterns._18_memento.moon;

public class GameSave {

	private final int blueTeamScore;
	private final int redTeamScore;
	
	public GameSave(int blueTeamScore, int redTeamScore) {
		super();
		this.blueTeamScore = blueTeamScore;
		this.redTeamScore = redTeamScore;
	}
	
	public int getBlueTeamScore() {
		return blueTeamScore;
	}
	
	public int getRedTeamScore() {
		return redTeamScore;
	}
	
	
}
