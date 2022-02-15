package me.whiteship.designpatterns._01_creational_patterns._01_singleton.moon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.whiteship.designpatterns._01_creational_patterns._01_singleton.SpringConfig;

public class SpringExample {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		String bean = applicationContext.getBean("hello", String.class);
		String bean2 = applicationContext.getBean("hello", String.class);
		
		System.out.println(bean == bean2);
	}

}
