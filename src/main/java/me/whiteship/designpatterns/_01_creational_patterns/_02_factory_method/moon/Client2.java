package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.moon;


public class Client2 {

    public static void main(String[] args) {
    	// client 코드에 의존성 주입으로 client 코드 변경을 최소화할 수 있다.
    	// client 에서 구체적인 Factory를 알고 있어야 한다.
    	// 구체적인 class가 생길수록 client 코드가 변경될 소지가 있다.
    	Ship whiteShip = new WhiteShipFactory().orderShip("whiteship", "moon@email.com");
    	System.out.println(whiteShip);
    	Ship blackShip = new BlackShipFactory().orderShip("blackship", "moon@email.com");
    	System.out.println(blackShip);
    }

}
