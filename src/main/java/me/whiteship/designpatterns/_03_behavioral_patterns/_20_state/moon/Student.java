package me.whiteship.designpatterns._03_behavioral_patterns._20_state.moon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    
    public String getName() {
		return name;
	}

	private Set<OnlineCourse> onlineCourses = new HashSet<>();
    
    public boolean isAvaliable(OnlineCourse onlineCourse) {
		return onlineCourses.contains(onlineCourse);
	}
    
    public void addPrivate(OnlineCourse onlineCourse) {
    	this.onlineCourses.add(onlineCourse);
	}
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
