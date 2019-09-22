package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question09 {
	/**
	 * 
	 * @param lower
	 * @param higher
	 * assume lower <= higher
	 * return the sum of all unique integers between lower and higher
	 * INCLUSIVE of the 2 boundaries
	 */

	@Test
	void testSumRange() {
		
		assertEquals(70,SumRange(70,70));
		assertEquals(-70,SumRange(-70,-70));
		
		assertEquals(10,SumRange(0,4));
		assertEquals(10,SumRange(1,4));
		
		assertEquals(0,SumRange(-5,5));
		
	}
}
