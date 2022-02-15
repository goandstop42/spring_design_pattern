package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.moon;

// java 8일 경우 interface에 private 메서드 사용 못한다.(default메서드는 가능)
// abstract 만들어 ShipFactory interface 메서드를 구현한다.
public abstract class DefaultShipFactory implements ShipFactory {

	public void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}

	
}
