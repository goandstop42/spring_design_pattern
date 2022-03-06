package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter.moon;

import java.util.Map;

/** Interpreter
 * - ex. 정규표현식
 *
 */
public class App {

	public static void main(String[] args) {
		PostfixExpression expression = PostfixParser.parse("xyz+-");
		
		int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z',3));
		
		System.out.println(result);
	}
}
