package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question36 {
	/**
	 * assume that the string has at least 2 characters
	 * @param str
	 * @return a similar string without the first and last character of String str
	 */

		void testGetWithoutFristAndLastChar() {
		assertEquals("ello Worl", getWithoutFristAndLastChar("Hello World"));
		assertEquals("uper Supe", getWithoutFristAndLastChar("Super Super"));
		assertEquals("Two3Four", getWithoutFristAndLastChar("1Two3Four5"));
		assertEquals("What's your name", getWithoutFristAndLastChar(" What's your name?"));
		assertEquals("usr/tmp/package1/Java_programing", getWithoutFristAndLastChar("/usr/tmp/package1/Java_programing/"));	
	}
}