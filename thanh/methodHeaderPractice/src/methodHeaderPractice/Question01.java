package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question01 {
	/**
	 *
	 * @param val
	 * @return true if val is positive (more than 0), false otherwise
	 */

	@Test
	void testIsPositive() {
		assertTrue(isPositive(1.5));
		assertFalse(isPositive(-0.1));
		assertFalse(isPositive(0));
		assertFalse(isPositive(-90));
		assertFalse(isPositive(Integer.MIN_VALUE)); //for completeness
	}
}

/*
 * square(int):int
 * higher(int,int):int
 * highest(int,int,int):int
 * isInRange(int,int,int):boolean
 * isDivisibleBy(int,int):boolean
 * getLastDigit(int):int
 * xor(boolean,boolean):boolean
 * sum(int,int):int (assuming first int <= second int)
 */
*/
