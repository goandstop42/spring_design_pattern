package me.whiteship.designpatterns._03_behavioral_patterns._20_state.moon;

import java.util.List;

public class Published implements State{

	private OnlineCourse onlineCourse;
	
	public Published(OnlineCourse onlineCourse) {
		this.onlineCourse = onlineCourse;
	}

	@Override
	public void addReview(String review, Student student) {
		this.onlineCourse.getReviews().add(review);
	}

	@Override
	public void addStudent(Student student) {
		this.onlineCourse.getStudents().add(student);
	}

}
