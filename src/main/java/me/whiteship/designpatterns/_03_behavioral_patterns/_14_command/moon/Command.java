package me.whiteship.designpatterns._03_behavioral_patterns._14_command.moon;

// 자바의 runnable interface 사용해도 됨
public interface Command {

	void execute();
	
	void undo();
}
