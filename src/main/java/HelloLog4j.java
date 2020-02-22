import model.User;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

/**
 * @author chenly
 * @create 2020-02-20 20:41
 */
public class HelloLog4j {
	public static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		logger.error("Hello, World!");

		User user = new User("nicole", LocalDateTime.now());

		logger.debug("Opening connection to {}...", user);
		logger.printf(Level.INFO, "Logging in user %1$s with birthday %2$tm %2$te,%2$tY", user.getName(),
				user.getBirthDay());

		if (logger.isDebugEnabled()) {
			logger.debug("Some long-running operation returned {}", expensiveOperation());
		}

		logger.trace("Some long-running operation returned {}", () -> expensiveOperation());
	}

	public static String expensiveOperation() {
		return "happy";
	}
}
