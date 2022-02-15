package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

public class ThreadUnSafeSettings {

	private static ThreadUnSafeSettings instance;
	
	//외부에서 생성하지 못하게 하기 위해 private으로 생성자 선언
	//Settings에서만 생성 가능
	private ThreadUnSafeSettings() {};
	
	public static ThreadUnSafeSettings getInstance() {
		// return new Settings(); // - 이렇게 하면 매번 새로운 Settings 생성됨
		
		// if 문으로 생성 여부를 체크하면 멀티스레이드에서 안전하지 않음
		if(instance == null) {
			instance = new ThreadUnSafeSettings();
		}
		
		return instance;
	}
}
