package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question08 {
	/**
	 * 
	 * @param boolean1
	 * @param boolean2
	 * return true if exactly one of the two values is true, return false otherwise
	 * #Challenge: Do it in 1 line if you're not a noob
	 */

	@Test
	void testXor() {
		assertFalse(Xor(true, true));
		assertFalse(Xor(false, false));
		assertTrue(Xor(true, false));
		assertTrue(Xor(false, true));	
	}
}
