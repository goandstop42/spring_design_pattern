package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.moon;

// java 8일 경우 interface에 private 메서드 사용 못한다.(default메서드는 가능)
// abstract 만들어 ShipFactory interface 메서드를 구현한다.
public abstract class DefaultShipFactory implements ShipFactoryInterface {

	@Override
	public void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}

	@Override
	public void validate(String name, String email) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("배 이름을 지어주세요.");
		}
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("연락처를 남겨주세요.");
		}

	}

	@Override
	public void prepareFor(String name) {
		System.out.println(name + " 만들 준비 중");
	}

	
}
