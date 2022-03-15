package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.moon;

public class Nomal implements Speed{

	@Override
	public void blueLight() {
		System.out.println("무궁화 꽃 이");
	}

	@Override
	public void redLight() {
		System.out.println("피었 습 니 다.");
	}

	
}
