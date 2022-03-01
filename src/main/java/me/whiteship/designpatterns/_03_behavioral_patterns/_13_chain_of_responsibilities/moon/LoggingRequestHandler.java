package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities.moon;

public class LoggingRequestHandler extends RequestHandler {
	
    public LoggingRequestHandler(RequestHandler nextHandler) {
			super(nextHandler);
	}

	@Override
	public void handle(Request request) {
        System.out.println("로깅");
		super.handle(request);
		System.out.println("로깅후");
	}

}
