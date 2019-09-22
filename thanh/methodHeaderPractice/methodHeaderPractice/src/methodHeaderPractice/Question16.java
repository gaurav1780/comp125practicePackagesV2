package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question16 {
	/**
	 * 
	 * @param data
	 * @return false if data is empty or null
	 * 
	 * @return true if EXACTLY a half of the number of values of data are even
	 * @return false otherwise
	 * For example:
	 *	int[] data= {-10, -20, -30, -40, -50,-60};
	 *	=> there are 5 even numbers and the size of the array is 5
	 *	=> return false because the number of even numbers is not
	 *	   equal to a half of the array size.
	 */

	@Test
	void testIsBalanced() {
		int[] empty = {};
		int[] a =  { 5, 6 , -4, -1};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1,1};
		int[] e = {-1, -5, 5, 4, 4};
		
		assertFalse(isBalanced(null));
		assertFalse(isBalanced(empty));
		
		assertTrue(isBalanced(a));
		assertFalse(isBalanced(b));
		assertFalse(isBalanced(c));
		assertTrue(isBalanced(d));
		assertFalse(isBalanced(e));
	}
	

}
