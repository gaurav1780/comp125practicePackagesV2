package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question32 {
	/**
	 *
	 * @param str
	 * @return the last character of the string
	 */

	@Test
	void testGetLastChar() {
		assertEquals('d',getLastChar("Hello World"));
		assertEquals('5',getLastChar("Maroon 5"));
		assertEquals('5',getLastChar("1 Two 3 Four 5"));
		assertEquals('?',getLastChar(" What's your name?"));
		assertEquals('t',getLastChar("my name is mr.robot"));
	}
}