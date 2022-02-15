package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* Enum
 * - 상속하지 못함 
 * - 미리 생성됨
 * */
public class EnumApp {

	//reflection 에서 enum은 newInstance을 막음
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//싱클톤을 깨는 방법 : 리플렉션
		EnumSettings settings4 = EnumSettings.INSTANCE;
		Constructor<?>[] declaredConstructors= EnumSettings.class.getDeclaredConstructors();

		EnumSettings settings = null;
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			settings = (EnumSettings) constructor.newInstance("INSTANCE");
		}
		
		System.out.println(settings4 == settings);
		
	}
}
