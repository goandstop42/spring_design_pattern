package me.whiteship.designpatterns._02_structural_patterns._09_decorator.moon;

public class DefaultCommentService implements CommentService {

	@Override
	public void addComment(String comment) {
		System.out.println(comment);
	}

	
}
