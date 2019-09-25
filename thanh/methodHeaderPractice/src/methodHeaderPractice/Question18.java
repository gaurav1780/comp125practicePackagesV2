package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question18 {
	/**
	 * 
	 * @param data
	 * @return false if data is empty or null
	 * 
	 * @return true if all items of the first half are negative, 
	 * and the second half are positive 
	 * If array contains an odd number of items,
	 * the middle item is considered to be in the right half.
	 * Note: 0 is neither negative nor positive
	 */

	@Test
	void testFirstHalfSecondHalf() {
		int[] empty = {};
		int[] a =  { -5, -6 , 4, 1, 3};
		int[] b = {-10, 0 , 5, 20, -55, 100};
		int[] c= {-10, -20, -30, -40};
		int[] d = {-1,1, -2};
		int[] e = {-1, -5, 5, 4};
		int[] f = { -5, -4, -2, -5, 4, 5, 4, 0};
		int[] g = { -5, -4, -2, -5, 4, 5, 4, 10, 5};
		int[] h = {0,0};
		int[] i = {-1,0,0};
		assertFalse(firstHalfSecondHalf(null));
		assertFalse(firstHalfSecondHalf(empty));
		
		assertTrue(firstHalfSecondHalf(a));
		assertFalse(firstHalfSecondHalf(b));
		
		assertFalse(firstHalfSecondHalf(c));
		assertFalse(firstHalfSecondHalf(d));
		
		assertTrue(firstHalfSecondHalf(e));
		assertFalse(firstHalfSecondHalf(f));
		
		assertTrue(firstHalfSecondHalf(g));
		assertFalse(firstHalfSecondHalf(h));
		
		assertFalse(firstHalfSecondHalf(i));
		
	}
	

}
