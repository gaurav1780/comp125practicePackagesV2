package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question04 {
	/*
	 * return the highest value of the passed parameters
	 * return any of them if passed parameters are equal
	 */
	
	@Test
	void testHighest() {
		assertEquals(25,Highest(25,5,5));
		assertEquals(100, Highest(-10,100,-10));
		assertEquals(0, Highest(0,0,0));
		assertEquals(400, Highest(20,5,400));
		assertEquals(0, Highest(-5,-5, 0));
		assertEquals(9, Highest(5, 0, 9));
	}
}
