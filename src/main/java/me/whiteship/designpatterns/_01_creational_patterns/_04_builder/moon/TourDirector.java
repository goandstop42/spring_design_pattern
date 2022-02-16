package me.whiteship.designpatterns._01_creational_patterns._04_builder.moon;

import java.time.LocalDate;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class TourDirector {

	private TourPlanBuilder tourPlanBuilder;
	
	public TourDirector(TourPlanBuilder tourPlanBuilder) {
		this.tourPlanBuilder = tourPlanBuilder;
	}
	
	public TourPlan cancunTrip() {
		return tourPlanBuilder.title("칸쿤")
		.nightsAndDays(2, 3)
		.startDate(LocalDate.of(2020, 12, 9))
		.whereToStay("리조트")
		.addPlan(0, "체크인하기")
		.addPlan(0, "저녁 식사")
		.getPlan();
	}
	
	public TourPlan loangBeachTrip() {
		return tourPlanBuilder.title("롱비치")
				.startDate(LocalDate.of(2021,  7, 15))
				.getPlan();
	}
}
