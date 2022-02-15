package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.moon;

public interface ShipFactoryInterface {

	default Ship orderShip(String name, String email) {
		validate(name, email);
		
		prepareFor(name);
		
		// 하위 클래스가 객체 생성
		// 커스텀마이징 부분은 객체를 생성할 때 하위 클래스에 위임
        Ship ship = createShip();
        
        sendEmailTo(email, ship);
		
		return ship;
	}

	void sendEmailTo(String email, Ship ship);

	void validate(String name, String email);
	
	void prepareFor(String name);
	
	Ship createShip();
}
