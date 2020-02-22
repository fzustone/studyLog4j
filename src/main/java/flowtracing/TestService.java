package flowtracing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * @author chenly
 * @create 2020-02-22 14:27
 */

public class TestService {
	private Logger logger = LogManager.getLogger(TestService.class.getName());

	private String[] messages = new String[] { "Hello, World", "Goodbye Cruel World", "You had me at hello" };
	private Random rand = new Random(1);

	public void setMessages(String[] messages) {
		logger.traceEntry(new JsonMessage(messages));
		this.messages = messages;
		logger.traceExit();
	}

	public String[] getMessages() {
		logger.traceEntry();
		return logger.traceExit(new JsonMessage(messages),messages);
	}

	public String retrieveMessage() {
		logger.entry();

		String testMsg = getMessage(getKey());

		return logger.exit(testMsg);
	}

	public void exampleException() {
		logger.entry();
		try {
			String msg = messages[messages.length];
			logger.error("An exception should have been thrown");
		} catch (Exception ex) {
			logger.catching(ex);
		}
		logger.exit();
	}

	public String getMessage(int key) {
		logger.entry(key);

		String value = messages[key];

		return logger.exit(value);
	}

	private int getKey() {
		logger.entry();
		int key = rand.nextInt(messages.length);
		return logger.exit(key);
	}
}