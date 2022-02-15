package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

import java.io.Serializable;

public class ThreadSafeSettings4 implements Serializable{

	private ThreadSafeSettings4() {};

	private static class SettingsHolder{
		private static final ThreadSafeSettings4 INSTANCE = new ThreadSafeSettings4();
	}
	
	// static inner 클래스 사용
	// 멀티스레드 환경에서도 안전
	// getInstance() 호출 이후 SettingsHolder를 만들기 때문에 lazy loading도 가능
	public static ThreadSafeSettings4 getInstance() {
		return SettingsHolder.INSTANCE;
	}
}
