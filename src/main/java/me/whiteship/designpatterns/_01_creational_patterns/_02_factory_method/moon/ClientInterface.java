package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.moon;


public class ClientInterface {

    public static void main(String[] args) {
    	
    	ClientInterface client = new ClientInterface();
    	client.print(new WhiteShipFactory(), "whiteship", "moon@email.com");
    	client.print(new BlackShipFactory(), "blackship", "moon@email.com");
    }

    // 인터페이스를 매개변수로 받으면 client 소스가 덜 변경된다.
    // 이걸 인터페이스로 뺄수도 있다.
	/*	private void print(ShipFactory shipFactory, String name, String email) {
			System.out.println(shipFactory.orderShip(name, email));
	
		}
	*/    
	private void print(ShipFactoryInterface shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
         
    

}
