package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question39 {
	/**
	 * @param str
	 * @return number of characters in str
	 * NOTE: contains/indexOf/lastIndexOf is not allowed
	 */
	//Rewritten javadoc
	/*
	* @param str1, str2
	* @return true if str1 contains str2
	* @return false otherwise
	* is the above NOTE still holds for this question? that is, can't students use those built in methods?
	*/

	@Test
	void testContains() {
		String a = "Hello Wolrd";
		String b = "super! super!";
		String c = "PokeMMO is available in the latest Ubuntu";
		String Empty = new String();
		
		String a1 = "Hello";
		String b1 = "super!";
		String b2 = "Super";
		String c1 = "is a";
		
		assertTrue(contains(a, Empty));
		assertFalse(contains(b, b2));
		assertFalse(contains(c, a1));
		assertFalse(contains(c, b1));
		assertTrue(contains(c, c1));
		assertFalse(contains(b, a1));
	}
}
