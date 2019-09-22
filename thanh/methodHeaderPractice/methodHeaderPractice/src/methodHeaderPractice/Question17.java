package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question17 {
	/**
	 * Asume that the size of the input Array is even.
	 * @param data
	 * @return false if data is empty or null
	 * 
	 * @return true if all items of the first half are negative, 
	 * and the second half are positive, assuming array contains an even number of items
	 * Note: 0 is neither negative nor positive
	 * @return false otherwise
	 * 
	 *For example:
	 *	int data[4] = {-4,-2, 1,0};
	 *	=> should return True because the first 2 items are negative (-4 and -2)
	 *	   and the last 2 items are positive (1 and 0)
	 */

	@Test
	void testFirstHalfSecondHalfBasic() {
		int[] empty = {};
		int[] a =  { -5, -6 , 4, 1};
		int[] b = {-10, 0 , 5, 20, -55, 100};
		int[] c= {-10, -20, -30, -40};
		int[] d = {-1,1};
		int[] e = {-1, -5, 5, 4};
		int[] f = { -5, -4, -2, -5, 4, 5, 4, 0};
		int[] g = { -5, -4, -2, -5, 4, 5, 4, 10};
		
		assertFalse(firstHalfSecondHalfBasic(null));
		assertFalse(firstHalfSecondHalfBasic(empty));
		
		assertTrue(firstHalfSecondHalfBasic(a));
		assertFalse(firstHalfSecondHalfBasic(b));
		
		assertFalse(firstHalfSecondHalfBasic(c));
		assertTrue(firstHalfSecondHalfBasic(d));
		
		assertTrue(firstHalfSecondHalfBasic(e));
		assertFalse(firstHalfSecondHalfBasic(f));
		assertTrue(firstHalfSecondHalfBasic(g));
		
	}
	

}
