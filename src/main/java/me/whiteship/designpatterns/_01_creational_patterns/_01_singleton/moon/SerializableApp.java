package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*Singleton
 * - 시스템 런타임, 환경 세팅데 대한 정보 등 인스턴스가 여러 개 일 때 문제가
 * 생길 수 있는 경우, 인스턴스 한 개 만 생성 
 * - 글로벌하게 접근
 * */
public class SerializableApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 싱클톤을 깨는 방법 : Serializable
		// 객체를 파일로 저장했다가 다시 로딩 가능
		// 역직렬화할 때 인스턴스 다시 생성
		
		SerializableSettings settings4 = SerializableSettings.getInstance();
		SerializableSettings settings = null;
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
			out.writeObject(settings4);
		}
		
		try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
			settings = (SerializableSettings)in.readObject();
		}
		System.out.println(settings4 == settings);
		
	}
}
