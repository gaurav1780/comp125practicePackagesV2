package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question42 {
	/**
	 * @param str
	 * @return a string with letters only 
	 * return null if str is null
	 */
	@Test
	void testGetLetter() {
		assertNull(getLetter(null));
		assertEquals("Hello", getLetter("Hello"));
		assertEquals("Thisiscompcourse", getLetter("This is comp 125 course!!"));
		assertEquals("MynamesMrRobot", getLetter("My name's Mr.Robot"));
		assertEquals("onetwofour", getLetter("one 1 two 2 four 5"));
		assertEquals("", getLetter("\t \n"));		//it's really weird
	}
}
