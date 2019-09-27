package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question41 {
	
	/**
	 * assume not null and not empty
	 * @param str1
	 * @param str2
	 * @return true if String str1 and String str2 are mutually reverse
	 */

	
	@Test
	void testAreMutuallyReverse() {
		assertTrue( areMutuallyReverse("ABCD","DCBA"));
		assertTrue( areMutuallyReverse("super","repus"));
		assertTrue( areMutuallyReverse("EDITH","HTIDE"));
		
		assertFalse( areMutuallyReverse("Hello Wold!","Hello What?"));
		assertFalse( areMutuallyReverse("I'm Ironman.","I'm"));
		assertFalse( areMutuallyReverse("bla bla","bla bla bla"));
		
	}
}
