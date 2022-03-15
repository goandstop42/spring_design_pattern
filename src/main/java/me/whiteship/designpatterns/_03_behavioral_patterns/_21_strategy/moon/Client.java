package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.moon;

import java.text.MessageFormat;

/**
 * Strategy
 * - 받는 파라미터에 따라 분기하는 경우
 * - 런타임 중에 전략 변경 가능
 */
public class Client {
	public static void main(String[] args) {

//		String pattern = "첫번째: {1} \n두번째 : {1} \n세번째 : {2} \n네번째 : {3}";
//		Object[] arguments = {"가나다", "ABC", "123", "!@#"};
//		  
//		String result = MessageFormat.format(pattern, arguments);
//		
//		System.out.println(result);
		
		/*// 이렇게 해도 되지만, 
		BlueLightRedLight game = new BlueLightRedLight(new Nomal());
		game.blueLight();
		*/

		//메서드 파라미터로 넘겨주면 operation 할 때 전략을 선택할 수 있다.
		BlueLightRedLight game = new BlueLightRedLight();
		game.blueLight(new Nomal());
		game.redLight(new Faster());
		
		// 익명 클래스 :한 번만 만들어지고 재사용되지 않으면 익명 클래스 고려
		game.blueLight(new Speed() {
			
			@Override
			public void redLight() {
			}
			
			@Override
			public void blueLight() {
			}
		});
	}
}
