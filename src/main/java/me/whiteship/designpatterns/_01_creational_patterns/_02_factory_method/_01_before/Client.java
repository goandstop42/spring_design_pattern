package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._01_before;

/*
Factory
- 인스턴스를 생성할 때 다른 코드 변경 없이 확장이 가능
- 역할을 나누다 보니 클래스가 많아짐
- OCP : 기존 코드를 변경하지 않으면서 기능 확장을 할 수 있는 구조 원칙
- default : 추상 클래스에서 하는 일을 인터페이스에서 할 수 있음
	기존 인터페이스를 확장해서 새로운 기능을 추가할 수 있어 
	이전 인터페이스를 수정하지 않아도 됨
	디폴트 메서드는 구현class에서 재정의 가능
	java 9 이상에서는 private 메서드 정의도 가능
*/
public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
