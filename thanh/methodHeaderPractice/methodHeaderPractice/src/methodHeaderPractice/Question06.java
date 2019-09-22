package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question06 {
	/**
	 * 
	 * @param numerator
	 * @param denominator assumed to be not equal to 0
	 * 
	 * return true if numerator is divisible by denominator
	 * return false otherwise
	 */

	@Test
	void testIsDivisible() {
		assertFalse(IsDivisible(10, 3));
		assertFalse(IsDivisible(20, -6));
		
		assertTrue(IsDivisible(-10, -5));
		assertTrue(IsDivisible(5, 1));
		
		assertTrue(IsDivisible(0, -1));
		assertTrue(IsDivisible(6,-6));
		
	}
}
