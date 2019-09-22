package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question19 {
	/**
	 * @param arr1, arr2
	 * @return true if the two arrays are identical, false otherwise
	 * @return false otherwise
	 * 
	 */

	@Test
	void testIdentical() {
		int[] empty = {};
		int[] a1 =  { -5, -6 , 4, 1, 3};
		int[] a2 = { -5, -6 , 4, 1, 3};
		
		int[] b1 = {1, 3, 6};
		int[] b2 = {1, 3, 6, 6};
		
		int[] c = { -5, -4, -2, -5, 4, 5, 4, 0};
		int[] d = { -5, -4, -2, -5, 4, 5, 4, 10, 5};
		
		assertTrue(identical(null, null));
		assertTrue(identical(empty, empty));
		
		assertTrue(identical(a1, a2));
		assertFalse(identical(b1, b2));
		
		assertFalse(identical(null, c));
		assertFalse(identical(d, empty));
		
		assertTrue(identical(c,c));
	}
	

}
