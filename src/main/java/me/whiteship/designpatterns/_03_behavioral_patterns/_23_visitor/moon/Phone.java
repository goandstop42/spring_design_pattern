package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor.moon;

public class Phone implements Device{

	@Override
	public void print(Circle circle) {
		System.out.println("Print Circle to Phone");
	}

	@Override
	public void print(Rectangle rectangle) {
		System.out.println("Print Rectangle to Phone");
	}

	@Override
	public void accept(Triangle triangle) {
		System.out.println("Print Triangle triangle to Phone");
	}
}
