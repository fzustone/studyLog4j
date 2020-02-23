package log4jstudy.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

/**
 * @author chenly
 * @create 2020-02-21 23:02
 */
public class FormatLogger {
	public static Logger logger= LogManager.getFormatterLogger(FormatLogger.class);

	public static void main(String[] args) {
		User user=new User("nicole", LocalDateTime.now());

		logger.debug("Logging in user %s with birthday %s", user.getName(), user.getBirthDay());
		logger.debug("Logging in user %1$s with birthday %2$tm %2$te,%2$tY", user.getName(), user.getBirthDay());
		logger.debug("Integer.MAX_VALUE = %,d", Integer.MAX_VALUE);
		logger.debug("Long.MAX_VALUE = %,d", Long.MAX_VALUE);
	}
}
