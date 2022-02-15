package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

public class ThreadSafeSettings1 {

	private static ThreadSafeSettings1 instance;
	
	private ThreadSafeSettings1() {};
	
	// synchronized 키워드 사용 이때, 성능에 불이득 발생 
	// lock를 사용하는 매커니즘 때문이다. 가장 간단한 방법
	public static synchronized ThreadSafeSettings1 getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSettings1();
		}
		
		return instance;
	}
}
