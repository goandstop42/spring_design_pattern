package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor.moon;


/**
 * Visitor
 * - instance of / if~else가 많은 경우
 * - element : Circle, Rectangle, Triangle
 * - Visitor : Device
 * - Concrete Visitor : Phone, Watch
 * - 구체적인 type을 찾아가는 과정이 두 번 발생 : 더블 디스패치
 * - 새로운 element가 추가/삭제 되면 Concrete Visitor도 수정되어야 함
 */
public class Client {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Device device = new Phone();
		
		// 상위타입이더라도 compile time에
		// 어떤 타입이 될지 모른다.
		// 메서드 오버로딩은 compile 시 구체적인  
		// type으로 맴핑되어야 한다. stactic
		//rectangle.printTo(device);
		
		rectangle.accept(device);
	}
}
