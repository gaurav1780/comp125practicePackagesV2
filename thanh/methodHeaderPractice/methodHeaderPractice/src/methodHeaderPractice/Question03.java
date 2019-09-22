package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question03 {
	/*
	 * @param val1, val2
	 * return the higher value of the passed parameters (val1 and val2)
	 * return any of them if passed parameters are equal
	 */
	
	@Test
	void testHigher() {
		assertEquals(25,Higher(25,5));
		assertEquals(100, Higher(-10,100));
		assertEquals(-10, Higher(-100, -10));
		assertEquals(0, Higher(0,0));
	}
}