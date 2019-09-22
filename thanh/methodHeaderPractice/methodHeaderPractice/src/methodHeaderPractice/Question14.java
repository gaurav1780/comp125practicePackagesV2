package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question14 {
	/**
	 * 
	 * @param data
	 * @return false if data is empty or null
	 * 
	 * @return true if data contains an even number
	 * @return false otherwise
	 * 
	 */

	@Test
	void testContainsEven() {
		int[] empty = {};
		int[] a =  { 5, 6 ,4};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1};
		
		assertFalse(containsEven(null));
		assertFalse(containsEven(empty));
		
		assertTrue(containsEven(a));
		assertTrue(containsEven(b));
		assertTrue(containsEven(c));
		assertFalse(containsEven(d));
	}
	

}
