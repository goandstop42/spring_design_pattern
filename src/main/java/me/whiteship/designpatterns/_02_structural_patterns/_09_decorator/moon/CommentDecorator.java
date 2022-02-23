package me.whiteship.designpatterns._02_structural_patterns._09_decorator.moon;

//감싸는 역할
public class CommentDecorator implements CommentService{

	private CommentService commentService;
	
	public CommentDecorator(CommentService commentService) {
		this.commentService = commentService;
	}
	
	@Override
	public void addComment(String comment) {
		commentService.addComment(comment);
	}

	
}
