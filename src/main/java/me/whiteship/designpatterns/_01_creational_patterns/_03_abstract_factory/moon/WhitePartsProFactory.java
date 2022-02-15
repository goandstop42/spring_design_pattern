package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.moon;

public class WhitePartsProFactory implements ShipPartsFactory{

	@Override
	public Anchor createAnchor() {
		 
		return new WhiteAchorPro();
	}

	@Override
	public Wheel createWheel() {
		 
		return new WhiteWheelPro();
	}

}
