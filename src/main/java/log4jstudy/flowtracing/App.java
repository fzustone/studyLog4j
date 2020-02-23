package log4jstudy.flowtracing;

/**
 * @author chenly
 * @create 2020-02-22 14:28
 */
public class App {

	public static void main( String[] args ) {
		TestService service = new TestService();
		service.retrieveMessage();
		service.retrieveMessage();
		service.exampleException();
	}
}
