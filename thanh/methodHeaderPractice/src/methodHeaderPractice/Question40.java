package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question40 {
	/**
	 * @param str
	 * @return return true if String str has repeating characters
	 * 			.Otherwise, return false.
	 */

	@Test
	void testContainsRepeatingChar() {
		assertTrue( containsRepeatingChar("String str has repeating characters"));
		assertTrue( containsRepeatingChar("Hello World"));
		assertTrue( containsRepeatingChar("The Blacklist"));
		
		assertFalse( containsRepeatingChar("One23Four5"));
		assertFalse( containsRepeatingChar("Superman"));
		assertFalse( containsRepeatingChar("be coding"));

	}
}