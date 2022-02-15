package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

public class SerializableSettings {

	private SerializableSettings() {};

	private static class SettingsHolder{
		private static final SerializableSettings INSTANCE = new SerializableSettings();
	}
	
	public static SerializableSettings getInstance() {
		return SettingsHolder.INSTANCE;
	}
	
	// 이 시그니처를 가지고 있으면 역직렬화할 때 이 메소드를 사용함 
	// 동일한 객체를 사용할 수 있음
	protected Object readResolve() {
		return getInstance();
	}
}
