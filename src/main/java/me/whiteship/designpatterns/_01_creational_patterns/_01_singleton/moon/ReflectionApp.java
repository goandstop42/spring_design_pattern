package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*Singleton
 * - 시스템 런타임, 환경 세팅데 대한 정보 등 인스턴스가 여러 개 일 때 문제가
 * 생길 수 있는 경우, 인스턴스 한 개 만 생성 
 * - 글로벌하게 접근
 * */
public class ReflectionApp {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//싱클톤을 깨는 방법 : 리플렉션
		ThreadSafeSettings4 settings4 = ThreadSafeSettings4.getInstance();
		Constructor<ThreadSafeSettings4> constructor = ThreadSafeSettings4.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		ThreadSafeSettings4 threadSafeSettings4 = constructor.newInstance();
		System.out.println(settings4 == threadSafeSettings4);
		
	}
}
