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
	
	/*
	 * 11 countNegatives(int[]):int
	 * 12 sumInRange(int[], int, int): int
	 * 13 countNotInRange(int[], int, int): int
	 * 14 containsEven(int[]):boolean
	 * 15 allOdd(int[]):boolean
	 * 16 isBalanced(int[]):boolean (true if exactly half values even and half odd)
	 * 17 firstHalfSecondHalfBasic(int[]): (true if all items of the first half are negative, 
	 *                and the second half are positive, assuming array contains an even number of items
	 * 18 firstHalfSecondHalf(int[]): (true if all items of the first half are negative, 
	 *                and the second half are positive. If array contains an odd number of items,
	 *                the middle item is considered to be in the right half).
	 * 19  identical(int[], int[]): return true if the two arrays are identical, false otherwise
	 * 20 eachItemDifferent(int[]): return true if each item is different, false otherwise 
	 */
}
