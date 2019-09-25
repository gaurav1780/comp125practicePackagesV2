package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question02
{
	/*
	 * @param val
	 * @return the square of val
	 */
	

	@Test
	void testSquare() {
		assertEquals(25, square(5));
		assertEquals(100, square(-10));
		assertEquals(0, square(0));
	}
}
