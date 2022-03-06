package me.whiteship.designpatterns._03_behavioral_patterns._14_command.moon;

import java.util.Stack;

/** Command
 * - 요청을 호출하는 쪽과 처리하는 쪽 사이에 command type의 객체를 통해 
 * - 요청과 수신을 분리
 * - receiver의 코드가 바뀌면 Command의 구현체 코드가 변경될 수 밖에 없음
 * - 하지만 invoker 코드가 안 바뀌는 것이 중요
 * - 재사용할 수 있음, MyApp에서 Command를 재사용
 * - invoker에서 구체적인 receiver를 직접 사용하면 receiver 코드가 변경되면
 * - invoker의 코드도 변경해야 함
 * - command 패턴을 적용하면 command 객체가 변경하면 됨
 */
public class Button {

	/* undo 기능 전
	private Command command;
	
	public Button(Command command) {
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
	*/
	
	// undo 기능 적용
	
	private Stack<Command> commands = new Stack<>();
	
	public void press(Command command) {
		command.execute();
		commands.push(command);
	}
	
	public void undo() {
		if(!commands.isEmpty()) {
			Command command = commands.pop();
			command.undo();
		}
	}
	
	public static void main(String[] args) {
		Button button = new Button();
		button.press(new GameStartCommand(new Game()));
		button.press(new LightOnCommand(new Light()));
		
		button.undo();
		button.undo();
		
	}
	
}
