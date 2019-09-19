package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question01 {
	/**
	 * 
	 * @param val
	 * @return true if val is positive (more than 0), false otherwise 
	 */
	
	@Test
	void testIsPositive() {
		assertTrue(isPositive(1.5));
		assertFalse(isPositive(-0.1));
		assertFalse(isPositive(0));
		assertFalse(isPositive(-90));
		assertFalse(isPositive(Integer.MIN_VALUE)); //for completeness
	}
}