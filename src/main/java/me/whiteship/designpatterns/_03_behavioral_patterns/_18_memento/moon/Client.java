package me.whiteship.designpatterns._03_behavioral_patterns._18_memento.moon;

/**
 * Memnto
 * - 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장했다가 다시 복구
 * - Memento 객체는 immutable한 객체로 내부 상태가 한 번 세팅되면 
 *   변경할 수 없는 객체로 구성
 * - CareTaker는 Memento 객체를 통해 Originator 상태를 복원
 *
 */
public class Client {

    public static void main(String[] args) {
    	// 기존 코드에서는 Client는 Game의 내부 상태를 자세히 알고 있어야 함.
    	Game game = new Game();
		game.setRedTeamScore(10);
		game.setBlueTeamScore(20);
		
		GameSave save = game.save();
		
		game.setRedTeamScore(12);
		game.setBlueTeamScore(22);
		
		game.restore(save);
		
		System.out.println(save.getBlueTeamScore());
    }
}
