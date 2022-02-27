package me.whiteship.designpatterns._02_structural_patterns._11_flyweight.moon;


/**
 * 변하지 않는 부분은 다른 인스턴스에서 공유하므로 
 * immutable 해야 함
 * - 변수에 final 붙임
 * - 상속 막기 위해 class에 final 붙임 
 */
public final class Font {

	final String family;
	
	final int size;

	// 객체 생성 시에만 
	public Font(String family, int size) {
		super();
		this.family = family;
		this.size = size;
	}

	public String getFamily() {
		return family;
	}

	public int getSize() {
		return size;
	}
	
	
}
