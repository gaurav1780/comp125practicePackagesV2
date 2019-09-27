package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question43 {
	/**
	 * @param str
	 * @return a string with single white space only
	 */
@Test
	void testGetWithSingleWhitespace() {
		assertEquals("Hello", getWithSingleWhitespace("Hello"));
		assertEquals("This is a String with more than 2 space ", getWithSingleWhitespace("This is a String with more than  2   space     "));
		assertEquals(" I'm i r o n man ", getWithSingleWhitespace("  I'm  i r o n     man  "));
		assertEquals("", getWithSingleWhitespace(" C  O  M   P 1  2 5  i  s h a r   d  "));
	}
}
