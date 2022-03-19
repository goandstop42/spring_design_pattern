package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor.moon;

public interface Device {

	void print(Circle circle);

	void print(Rectangle rectangle);

	void accept(Triangle triangle);
}
