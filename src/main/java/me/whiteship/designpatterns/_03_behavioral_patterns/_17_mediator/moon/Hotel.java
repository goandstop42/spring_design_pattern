package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator.moon;

import java.time.LocalDateTime;

/** 
 * Mediator
 * - 컴포넌트들간의 결합도를 낮춤
 * - 모든 Colleague는 Mediator 인터페이스를 참조 
 * - Colleague가 직접 Colleague를 참조하지 않음
 * - ConcreateMediator가 각각의 colleague들을 참조
 * - mediator 객체가 복잡해짐, 의존성이 집중됨
 * - 트레이드오프 고려 필요
 */
public class Hotel {

    public static void main(String[] args) {
        Guest guest = new Guest();
        LocalDateTime currentDateTime = LocalDateTime.now();  
        guest.getTowers(3);
        guest.dinner(currentDateTime);

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }
}
