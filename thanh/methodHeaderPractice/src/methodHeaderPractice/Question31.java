package methodHeaderPractice;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class Question31 {
	/**
	 * assume that String has at least one char
	 * @param str
	 * @return the first character of the string
	 */

	@Test
	void testGetFristChar() {
		assertEquals('H',getFirstChar("Hello World"));
		assertEquals('M',getFirstChar("Maroon 5"));
		assertEquals('1',getFirstChar("1Two3Four5"));
		assertEquals(' ',getFirstChar(" What's your name?"));
		assertEquals('m',getFirstChar("my name is mr.robot"));
		}
}
