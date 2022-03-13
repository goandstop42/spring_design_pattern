package me.whiteship.designpatterns._03_behavioral_patterns._20_state.moon;

/**
 * State
 * - 특정한 상태마다 다른 operation이 필요한 경우
 * - 전략 패턴은 한 번 인스턴스를 생성하고 나면, 상태가 거의 바뀌지 않는 경우에 사용
 * - 상태 패턴은 한 번 인스턴스를 생성하고 난 뒤, 상태를 바꾸는 경우가 빈번한 경우에 사용한
 */
public class Client {

    public static void main(String[] args) {

    	OnlineCourse onlineCourse = new OnlineCourse();
    	
    	
    	Student student = new Student("moon");
    	Student leeStudent = new Student("lee");
    	onlineCourse.changeState(new Draft(onlineCourse));
    	onlineCourse.addStudents(student);
    	onlineCourse.addReview("hello2", student);
    	
    	onlineCourse.changeState(new Private(onlineCourse));
    	onlineCourse.addReview("hello2", student);

    	onlineCourse.changeState(new Published(onlineCourse));
    	onlineCourse.addReview("hello2", student);
    	onlineCourse.addStudents(leeStudent);
    	
    	
    	System.out.println(onlineCourse.toString());
    	System.out.println(onlineCourse.getReviews());
    	
    	System.out.println(onlineCourse.getStudentReview(leeStudent));
    }
}