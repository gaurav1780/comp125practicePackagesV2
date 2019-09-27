package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question35 {
	/**
	 * 
	 * @param str, assume not null, not empty
	 * @return a similar string without last character of String str
	 */

	@Test
	void testGetWithoutLastChar() {
		assertEquals("Hello Worl", getWithoutLastChar("Hello World"));
		assertEquals("Super Supe", getWithoutLastChar("Super Super"));
		assertEquals("1Two3Four", getWithoutLastChar("1Two3Four5"));
		assertEquals(" What's your name", getWithoutLastChar(" What's your name?"));
		assertEquals("/usr/tmp/package1/Java_programing", getWithoutLastChar("/usr/tmp/package1/Java_programing/"));

	}
}
