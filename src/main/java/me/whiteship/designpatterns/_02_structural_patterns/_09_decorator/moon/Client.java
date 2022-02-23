package me.whiteship.designpatterns._02_structural_patterns._09_decorator.moon;

public class Client {

	private CommentService commentService;

	public Client(CommentService commentService) {
		this.commentService = commentService;
	}
	
	public void writeComment(String comment) {
		commentService.addComment(comment);
	}
	 
}
