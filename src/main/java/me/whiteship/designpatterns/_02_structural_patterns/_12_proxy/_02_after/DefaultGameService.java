package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;


/**
 * Subject : GameService
 * RealSubject : DefaultGameService 
 * 수정이 가능한한 소스라면 인터페이스를 만드는 것이
 * 테스트 코드 작성이나 유연성을 확보에 유리 
 */
public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("이 자리에 오신 여러분을 진심으로 환영합니다.");
    }
}
