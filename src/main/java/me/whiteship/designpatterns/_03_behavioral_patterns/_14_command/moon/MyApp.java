package me.whiteship.designpatterns._03_behavioral_patterns._14_command.moon;


public class MyApp {

	private Command command;

	public MyApp(Command command) {
		this.command = command;
	}
	
	public void press() {
		this.command.execute();
	}
	
	public static void main(String[] args) {
		// invoker인 button 코드는 변경되지 않는다.
		//Button button = new Button(new LightOnCommand(new Light()));
		Button button = new Button(new GameStartCommand(new Game()));
		button.press();
	}
}
