package me.whiteship.designpatterns._01_creational_patterns._04_builder.moon;

import java.time.LocalDate;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;


public interface TourPlanBuilder {

	TourPlanBuilder title(String title);
	
	TourPlanBuilder nightsAndDays(int nights, int days);
	
    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);
    
	TourPlan getPlan();
}
