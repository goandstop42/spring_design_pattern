package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter.moon;

import java.util.Map;

/** Interpreter
 * - ex. 정규표현식
 * - 자주 사용하는 패턴을 재사용할 수 있음
 * - 
 */
public class App {

	public static void main(String[] args) {
		PostfixExpression expression = PostfixParser.parse("xyz+-");
		
		int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z',3));
		
		System.out.println(result);
	}
}
