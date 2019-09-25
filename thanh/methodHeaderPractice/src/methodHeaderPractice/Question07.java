package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question07 {
	/**
	 * 
	 * @param val
	 * return the last digit of val
	 */

	@Test
	void testGetLastDigit() {
		assertEquals(0, GetLastDigit(0));		
		assertEquals(1, GetLastDigit(231));		
		assertEquals(1, GetLastDigit(-291));
		assertEquals(2, GetLastDigit(-22));		
	}
}
