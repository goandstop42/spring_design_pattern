package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.moon;

public class WhiteShipFactory extends DefaultShipFactory{

	//배를 만드는 특화된 부분만 구현
	@Override
	public Ship createShip() {
		 
		return new WhiteShip();
	}

}
