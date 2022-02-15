package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.moon;

/* Abstract Factory
 * - 패턴이 factory method 패턴과 비슷한데 관점 차이임
 * - client에서 추상화된 인터페이스만 사용하므로 concrete class 직접 참조하지 않음
 * - factory method 패턴은 구체적인 객체 생성 과정ㅇ르 하위 또는 구체적인 클래스로 옮기는 것이 목적
 * - Abstract Factory 패턴은 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적
 **/ 
public class ShipInventory {
	public static void main(String[] args) {

		ShipFactory shipFactoryPro = new WhiteShipFactory(new WhitePartsProFactory());
		ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
		Ship shipPro = shipFactoryPro.createShip();
		Ship ship = shipFactory.createShip();
		System.out.println(shipPro.getAnchor().getClass());
		System.out.println(shipPro.getWheel().getClass());
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
	}
}
