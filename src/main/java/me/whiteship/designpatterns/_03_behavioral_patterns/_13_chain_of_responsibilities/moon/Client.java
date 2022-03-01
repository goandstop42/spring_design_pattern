package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_responsibilities.moon;


/**
 * Chain of Responsibilities
 * - 요청을 보내는 쪽과 처리하는 쪽을 분리 
 * - 요청을 보내는 쪽에서 처리하는 handler의 타입에 의존하지 않음  
 * - 디버깅이 번거로움
 */
public class Client {
	
	private RequestHandler requestHandler;

	public Client(RequestHandler requestHandler) {
		this.requestHandler = requestHandler;
	}

	public void doWork() {
		Request request = new Request("클라이언트 호출");
		requestHandler.handle(request);
	}
	
	public static void main(String[] args) {
		RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
		
		Client client = new Client(chain);
		client.doWork();
	}
}
