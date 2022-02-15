package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.moon;

public interface ShipFactory {

	default Ship orderShip(String name, String email) {
		validate(name, email);
		
		prepareFor(name);
		
		// 하위 클래스가 객체 생성
		// 커스텀마이징 부분은 객체를 생성할 때 하위 클래스에 위임
        Ship ship = createShip();
        
        sendEmailTo(email, ship);
		
		return ship;
	}

	private void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 다 만들었습니다.");
	}

	private void validate(String name, String email) {
		 // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
	}
	
	private void prepareFor(String name) {
	        System.out.println(name + " 만들 준비 중");
	}
	
	Ship createShip();
}
