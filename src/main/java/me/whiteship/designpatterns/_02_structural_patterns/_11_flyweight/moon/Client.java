package me.whiteship.designpatterns._02_structural_patterns._11_flyweight.moon;


/**
 * Flyweight
 * - 객체를 가볍게 함
 * - 자주 변하는 부분과 자주 변하지 않는 부분을 분리
 * - 
 */
public class Client {
	public static void main(String[] args) {

		/*
		Character c1 = new Character('h', "white", "Nanum", 12);
		Character c2 = new Character('e', "white", "Nanum", 12);
		Character c3 = new Character('l', "white", "Nanum", 12);
		Character c4 = new Character('l', "white", "Nanum", 12);
		Character c5 = new Character('o', "white", "Nanum", 12);*/
		
		FontFactory fontFactory = new FontFactory();
		Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
	}
}
