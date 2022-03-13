package me.whiteship.designpatterns._03_behavioral_patterns._19_observer.moon;

/**
 * Observer 
 * - 객체 상태 변화를 감지하고 일림을 받는 패턴
 * - 패턴을 사용하는 목적, 해결하려는 문제가 무엇인가가 더 중요
 * - Subject 상태 변경을 주기적으로 조회하지 않고 자동으로 감지(pulling하지 않음)
 * - 복잡도 증가
 */
public class Client {

    public static void main(String[] args) {
    	ChatServer chatServer = new ChatServer();
    	User user1 = new User("moon");
    	User user2 = new User("lee");
    	
    	chatServer.register("오징어", user2);
    	chatServer.register("오징어", user1);
    	
    	chatServer.register("디자인패턴", user1);
    	
    	// 구독자가 user1, user2
    	chatServer.sendMessage(user1, "오징어", "이름이 기억났어");
    }
}
