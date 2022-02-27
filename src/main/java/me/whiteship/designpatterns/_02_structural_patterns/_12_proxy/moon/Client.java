package me.whiteship.designpatterns._02_structural_patterns._12_proxy.moon;


/**
 * Proxy
 * - Client가 원래 사용하려는 객체(RealSubject)를 직접 사용하지 않고
 * - 중간 객체를 사용하는 패턴
 * - 접근 제어, 로깅, 초기화 지연, 캐싱 등에 응용
 * - 기존 코드를 변경하지 않고 새로운 기능을 추가할 수 있음
 */
public class Client {
	public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
	}
}
