package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question11 {
	/**
	 * 
	 * @param data
	 * @return number of negative items of data
	 * @return 0 if array is null or empty
	 */

	@Test
	void testCountNegatives() {
		int[] empty = {};
		int[] a =  { 5, 6 ,4};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1};
		
		assertEquals(0, countNegatives(null));
		assertEquals(0, countNegatives(empty));
		assertEquals(0, countNegatives(a));
		assertEquals(2, countNegatives(b));
		assertEquals(5, countNegatives(c));
		assertEquals(1, countNegatives(d));
	}
	

}
