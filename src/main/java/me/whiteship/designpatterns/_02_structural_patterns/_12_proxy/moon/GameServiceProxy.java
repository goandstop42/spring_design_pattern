package me.whiteship.designpatterns._02_structural_patterns._12_proxy.moon;

public class GameServiceProxy extends GameService{

	@Override
	public void startGame() {
		long before = System.currentTimeMillis();
		super.startGame();
		System.out.println(System.currentTimeMillis() - before);
	}


	
}
