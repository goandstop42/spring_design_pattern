package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities.moon;

public abstract class RequestHandler {

	private RequestHandler nextHandler;

	public RequestHandler(RequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}
	
	public void handle(Request request) {
		if(nextHandler != null) {
			nextHandler.handle(request);
		}
	}
	
}
