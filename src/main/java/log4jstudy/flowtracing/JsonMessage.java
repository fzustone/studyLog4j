package log4jstudy.flowtracing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.status.StatusLogger;
/**
 * @author chenly
 * @create 2020-02-22 14:33
 */
public class JsonMessage implements Message {

	private static final long serialVersionUID = 1L;
	private static final ObjectMapper mapper = new ObjectMapper();
	private final Object object;

	/**
	 * Constructs a JsonMessage.
	 *
	 * @param object the Object to serialize.
	 */
	public JsonMessage(final Object object) {
		this.object = object;
	}

	@Override
	public String getFormattedMessage() {
		try {
			return mapper.writeValueAsString(object);
		} catch (final JsonProcessingException e) {
			StatusLogger.getLogger().catching(e);
			return object.toString();
		}
	}

	@Override
	public String getFormat() {
		return object.toString();
	}

	@Override
	public Object[] getParameters() {
		return new Object[] {object};
	}

	@Override
	public Throwable getThrowable() {
		return null;
	}
}
