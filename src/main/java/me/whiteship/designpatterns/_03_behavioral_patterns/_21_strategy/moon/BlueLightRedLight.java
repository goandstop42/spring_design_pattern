package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.moon;

public class BlueLightRedLight {

	
	/* 메서드 파라미터로 전략 선택
	private Speed speed;
 	
 	public BlueLightRedLight(Speed speed) {
		this.speed = speed;
	}*/

	public void blueLight(Speed speed) {
		speed.blueLight();
	}
	
	public void redLight(Speed speed) {
		speed.redLight();
	}
}
