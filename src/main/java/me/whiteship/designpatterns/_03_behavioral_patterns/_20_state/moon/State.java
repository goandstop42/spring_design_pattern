package me.whiteship.designpatterns._03_behavioral_patterns._20_state.moon;

import java.util.List;

public interface State {

	void addReview(String review, Student student);
	
	void addStudent(Student student);
	
}
