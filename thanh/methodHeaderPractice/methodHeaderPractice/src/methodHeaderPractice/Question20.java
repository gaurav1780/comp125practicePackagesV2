package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question20 {
	/**
	 * 
	 * @param data
	 * @return false if data is empty or null
	 * @return true if each item is different 
	 * @return false otherwise
	 * 
	 */

	@Test
	void testEachItemDifferent() {
		int[] empty = {};
		int[] a =  { 5, 6 , 4, 1};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1,1};
		int[] e = {-1, -5, 5, 4, 4};
		
		assertFalse(eachItemDifferent(null));
		assertFalse(eachItemDifferent(empty));
		
		assertTrue(eachItemDifferent(a));
		assertFalse(eachItemDifferent(b));
		assertTrue(eachItemDifferent(c));
		assertTrue(eachItemDifferent(d));
		assertFalse(eachItemDifferent(e));
	}
	

}
