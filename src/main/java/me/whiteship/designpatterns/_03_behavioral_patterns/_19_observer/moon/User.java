package me.whiteship.designpatterns._03_behavioral_patterns._19_observer.moon;

public class User implements Subscriber {

	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void handlerMessage(String message) {
		System.out.println(message);
	}
	
	
	
}
