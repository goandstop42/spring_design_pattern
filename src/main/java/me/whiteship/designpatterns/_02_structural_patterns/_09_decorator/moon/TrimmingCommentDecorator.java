package me.whiteship.designpatterns._02_structural_patterns._09_decorator.moon;

public class TrimmingCommentDecorator extends CommentDecorator{

	// 기본 생성자가 없는 부모를 받아야 하므로 
	// 자식이 받아서 부모한테 넘긴다
	public TrimmingCommentDecorator(CommentService commentService) {
			super(commentService);
	}

	@Override
	public void addComment(String comment) {
		super.addComment(trim(comment));
	}

	private String trim(String comment) {
		return comment.replace("...", "");
	}

	
}
