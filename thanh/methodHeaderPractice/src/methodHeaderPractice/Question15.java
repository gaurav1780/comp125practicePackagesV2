package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question15 {
	/**
	 * 
	 * @param data
	 * @return false if data is empty or null
	 * 
	 * @return true if data contains all odd numbers
	 * 
	 * @return false otherwise
	 * 
	 */

	@Test
	void testContainsAllOdd() {
		int[] empty = {};
		int[] a =  { 5, 6 ,4};
		int[] b = {-10, 0 , 5, 20, -55, 100, 0};
		int[] c= {-10, -20, -30, -40, -50};
		int[] d = {-1};
		int[] e = {-1, -5, 5, 7, 9};
		
		assertFalse(containsAllOdd(null));
		assertFalse(containsAllOdd(empty));
		
		assertFalse(containsAllOdd(a));
		assertFalse(containsAllOdd(b));
		assertFalse(containsAllOdd(c));
		assertTrue(containsAllOdd(d));
		assertTrue(containsAllOdd(e));
	}
	

}
