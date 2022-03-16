package me.whiteship.designpatterns._03_behavioral_patterns._22_template.moon;

public class Multiply extends FileProcessor {

	public Multiply(String path) {
			super(path);
	}

	@Override
	protected int getResult(int result, int number) {
		 
		return result *= number;
	}

	
}
