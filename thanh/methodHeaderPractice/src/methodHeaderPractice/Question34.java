package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question34 {
	/**
	 * @param str
	 * @return a similar string without the first character of String str
	 */

	@Test
	void testGetWithoutFirstChar() {
		assertEquals("ello World", getWithoutFirstChar("Hello World"));
		assertEquals("uper Super", getWithoutFirstChar("Super Super"));
		assertEquals("Two3Four5", getWithoutFirstChar("1Two3Four5"));
		assertEquals("What's your name?", getWithoutFirstChar(" What's your name?"));
		assertEquals("usr/tmp/package1/Java_programing/", getWithoutFirstChar("/usr/tmp/package1/Java_programing/"));
	}
}