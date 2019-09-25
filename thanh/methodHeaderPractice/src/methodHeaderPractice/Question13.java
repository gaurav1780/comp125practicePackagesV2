package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question13 {
	/**
	 * 
	 * @param data, lower, higher
	 * assume lower <= higher
	 * @return number of items of data that lies outside of the 2 boundaries
	 * @return 0 if array is null or empty
	 * 
	 */

	@Test
	void testCountNotInRange() {
		int[] empty = {};
		int[] a =  { 5, 6 ,4};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1};
		
		assertEquals(0, countNotInRange(null, 10, 20));
		assertEquals(0, countNotInRange(empty, 2, 4));
		
		assertEquals(0, countNotInRange(a, 4, 6));
		assertEquals(3, countNotInRange(b, -9, 20));
		assertEquals(5, countNotInRange(b, 0, 0));
		assertEquals(5, countNotInRange(c, 0, 1));
		assertEquals(0, countNotInRange(d, -1, -1));
	}
	

}
