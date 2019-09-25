package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question37 {
	void testGetWithoutFirstChar() {}
	/**
	 * @param str
	 * @return number of characters in str
	 * @return 0 if String str is null or empty
	 *	NOTE: length() method is not alllowed
	 */

		@Test
	void testCountCharacters() {
		assertEquals(0,countCharacters(null));
		assertEquals(0,countCharacters(""));
		assertEquals(11, countCharacters("Hello World"));
		assertEquals(11, countCharacters("Super Super"));
		assertEquals(10, countCharacters("1Two3Four5"));
		assertEquals(18, countCharacters(" What's your name?"));
		assertEquals(34, countCharacters("/usr/tmp/package1/Java_programing/"));	
	}
}