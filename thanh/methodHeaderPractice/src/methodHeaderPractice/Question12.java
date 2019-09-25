package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question12 {
	/**
	 * 
	 * @param data, lower, higher
	 * assume lower <= higher
	 * @return the sum of all items of data that lies within 
	 * the range of the 2 boundaries (INCLUSIVE of the boundaries)
	 * @return 0 if array is null or empty
	 * 
	 */

	@Test
	void testSumInRange() {
		int[] empty = {};
		int[] a =  { 5, 6 ,4};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1};
		
		assertEquals(0, sumInRange(null, 10, 20));
		assertEquals(0, sumInRange(empty, 2, 4));
		
		assertEquals(15, sumInRange(a, 4, 6));
		assertEquals(25, sumInRange(b, 0, 99));
		assertEquals(-150, sumInRange(c, -50, -10));
		assertEquals(-20, sumInRange(c, -21, -20));
		assertEquals(-1, sumInRange(d, -5, 5));
	}
	

}
