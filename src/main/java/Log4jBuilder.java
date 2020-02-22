import model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

/**
 * @author chenly
 * @create 2020-02-22 11:31
 */
public class Log4jBuilder {
	private static final Logger LOGGER= LogManager.getLogger(Log4jBuilder.class);

	public static void main(String[] args) {
		User user = new User("nicole", LocalDateTime.now());
		LOGGER.atInfo().withLocation().log("Login for user {} failed", user.getName());
		printLog();
	}

	public static void printLog(){
		LOGGER.atInfo().withLocation().log("Login for user failed");
	}
}
