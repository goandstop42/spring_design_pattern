package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

public class ThreadSafeSettings3 {

	// volatile : java 1.5 이상
	private static volatile ThreadSafeSettings3 instance = new ThreadSafeSettings3();
	
	private ThreadSafeSettings3() {};
	
	
	public static ThreadSafeSettings3 getInstance() {

		// double checked locking : 효율적인 동기화 블럭
		// 이미 있는 경우 동기화 메커니즘을 사용하지 않음
		// 멀티스레드가 비번한 경우만 synchronized 블럭이 적용됨
		// 인스턴스를 필요한 시점에 만들 수 있음
		// 단, java의 메모리 다루는 방법에 대한 이해가 필요
		if(instance == null) {
			synchronized (ThreadSafeSettings3.class) {
				if(instance == null) {
					instance = new ThreadSafeSettings3();
				}
			}
		}
		
		return instance;
	}
}
