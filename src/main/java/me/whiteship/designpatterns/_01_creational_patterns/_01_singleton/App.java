package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

/*Singleton
 * - 시스템 런타임, 환경 세팅데 대한 정보 등 인스턴스가 여러 개 일 때 문제가
 * 생길 수 있는 경우, 인스턴스 한 개 만 생성 
 * - 글로벌하게 접근
 * */
public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings5 settings = Settings5.INSTANCE;

        Settings5 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println(settings == settings1);
    }

}
