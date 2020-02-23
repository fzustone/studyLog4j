package log4jstudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

/**
 * @author chenly
 * @create 2020-02-22 19:44
 */
public class MarkerExample {
	public static Logger logger = LogManager.getLogger();
	private static final Marker SQL_MARKER = MarkerManager.getMarker("SQL");
	private static final Marker UPDATE_MARKER = MarkerManager.getMarker("SQL_UPDATE").setParents(SQL_MARKER);

	public static void main(String[] args) {
		logger.error("Hello, World!");

		logger.info(UPDATE_MARKER, "TEST Markers");

	}

}
