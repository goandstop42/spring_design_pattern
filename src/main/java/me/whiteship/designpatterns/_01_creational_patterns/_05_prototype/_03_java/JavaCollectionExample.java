package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;
// 추상적인 타입을 사용하면 구체적인 타입의 오프젝트를 다른 구현체로 변경할 수 있음
public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
