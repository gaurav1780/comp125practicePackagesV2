package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question05 {
	/**
	 * 
	 * @param lower
	 * @param higher
	 * @param val
	 * 
	 * Assuming  lower < higher
	 * return true if val is between lower and higher , EXCLUSIVE of the 2 bounds.
	 * return false otherwise
	 * Read the test cases carefully
	 * 
	 */

	@Test
	void testIsInRange() {
		assertFalse(IsInRange(-11,-10,-10));
		assertFalse(IsInRange(-11,-10,-11));
		
		assertTrue(IsInRange(0,20,10));
		assertTrue(IsInRange(9,11,10));
		assertTrue(IsInRange(0,11,10));
		
		assertFalse(IsInRange(-10, -5, -20));
		assertFalse(IsInRange(10,20,50));
		
	}
}
