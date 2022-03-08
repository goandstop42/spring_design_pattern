package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator.moon;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/** Iterator
 * - 집합 객체에 손쉽게 접근할 수 있는 방법 제공
 * - 집한 객체의 구조를 몰라도 됨
 */
public class Client {

	// Iterator type를 주입 받으면 client 코드 변경 없음
	
	/*private Iterator<Post> postIterator;
	
	public Client(Iterator<Post> postIterator) {
		this.postIterator = postIterator;
	}
	*/
    public static void main(String[] args) {

    	Board board = new Board();
    	board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        // board가 map인지 list인지 몰라도 된다.
        Iterator<Post> recentIterator = board.getRecentIterator();
        while (recentIterator.hasNext()) {
			System.out.println(recentIterator.next().getTitle());
			
		}
    }

}
