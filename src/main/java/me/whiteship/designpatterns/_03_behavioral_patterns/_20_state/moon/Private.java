package me.whiteship.designpatterns._03_behavioral_patterns._20_state.moon;

import java.util.List;

public class Private implements State {

	private OnlineCourse onlineCourse;

	public Private(OnlineCourse onlineCourse) {
		this.onlineCourse = onlineCourse;
	}

	@Override
	public void addReview(String review, Student student) {
		// this.onlineCourse.getStudents().contains(student)) 리팩토링이 필요한 코드
		// 세 번 메서드 체이닝이 필요하게 됨 
		// this.onlineCourse.contains 형태로 변경 필요
		if (this.onlineCourse.getStudents().contains(student)) {
			this.onlineCourse.getReviews().add(review);
		} else {
			throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
		}

	}

	@Override
	public void addStudent(Student student) {
		if (student.isAvaliable(this.onlineCourse)) {
			this.onlineCourse.getStudents().add(student);
		} else {
			throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.");
		}
	}
	

}
