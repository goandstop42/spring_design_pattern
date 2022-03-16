package me.whiteship.designpatterns._03_behavioral_patterns._22_template.moon;

/**
 * Template
 * - 로직이 유사/비슷한 경우 적용
 * - 코드 재사용하고 중복 코드 줄임
 * - 구체적인 알고리즘만 변경 가능
 * - 알고리즘이 복잡할 수록 Template 객체가 복잡해짐
 * - overriding 못하도록 final 키워드로 리스코프 치환 원칙 위반을 방지
 */
public class Client {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new Plus("number.txt");
		int result = fileProcessor.process();
		System.out.println(result);
		
		
	}
	
	
}
