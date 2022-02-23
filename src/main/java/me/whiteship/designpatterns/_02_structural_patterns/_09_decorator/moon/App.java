package me.whiteship.designpatterns._02_structural_patterns._09_decorator.moon;

/* Decorator 
 * - 런타임에 부가기능을 추가할 수 있음
 * - 단일 상속으로 상속을 사용하면 유연성이 줄어 듦
 * - 여러 기능을 필요로 할 경우 한 클래스에 여러 기능을 넣는 것이 
 * - 아니라 클래스 별 본연의 임무만 할 수 있도록 함
 * - 조합하는 건 다른 쪽에서 함
 */
public class App {

    private static boolean enabledSpamFilter = false;

    private static boolean enabledTrimming = true;
    
    public static void main(String[] args) {
		CommentService commentService = new DefaultCommentService();
		
		if(enabledSpamFilter) {
			commentService = new SpamFilteringCommentDecorator(commentService);
		}
		
		if(enabledTrimming) {
			commentService = new TrimmingCommentDecorator(commentService);
		}
		
		// commentService가 뭔지 모르나 구체적인 decorator로 감싸게 된다.
		// decorator가 decorator를 감싼다.
		
		Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
	}
}
