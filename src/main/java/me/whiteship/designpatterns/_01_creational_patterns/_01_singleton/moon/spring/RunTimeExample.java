package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon.spring;

public class RunTimeExample {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.maxMemory());
	}
}
