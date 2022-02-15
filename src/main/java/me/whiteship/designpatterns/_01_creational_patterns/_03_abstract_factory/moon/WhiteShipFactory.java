package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.moon;


public class WhiteShipFactory extends DefaultShipFactory{

	private ShipPartsFactory shipPartsFactory;
	
	
	
	public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}



	@Override
	public Ship createShip() {
		Ship ship = new WhiteShip();
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());
		
		return ship;
	}

}
