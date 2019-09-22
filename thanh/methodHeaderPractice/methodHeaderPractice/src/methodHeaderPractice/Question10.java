package methodHeaderPractice;

import org.junit.jupiter.api.Test;

public class Question10 {
	/**
	 * 
	 * @param data
	 * @return sum of all the items of data
	 * return 0 if array is null or empty
	 */

	@Test
	void testSum() {
		assertEquals(0, sum(null));

		int[] a = {10,70,20,90};
		assertEquals(190, sum(a));

		int[] b = {-60};
		assertEquals(-60, sum(b));

		int[] c = {};
		assertEquals(0, sum(c));
	}
}
