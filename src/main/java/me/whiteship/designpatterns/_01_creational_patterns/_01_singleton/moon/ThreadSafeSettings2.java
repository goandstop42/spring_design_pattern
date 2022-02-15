package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

public class ThreadSafeSettings2 {

	// 객체 만드는 비용이 많이 않다면 미리 만들 수 있다.
	// eager initialization(이른 초기화) 
	// 미리 만드는 것이 단점이 될 수 있음
	// 잘 안 쓰는 경우 미리 만드는 것이 메모리에 좋지 않음 
	private static final ThreadSafeSettings2 INSTANCE = new ThreadSafeSettings2();
	
	private ThreadSafeSettings2() {};
	
	// synchronized 키워드 사용하지 않아도 된다.
	public static ThreadSafeSettings2 getInstance() {
		return INSTANCE;
	}
}
