package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question33 {
	/**
	 *
	 * @param str1
	 * @param str2
	 * @return return true if 2 strings are the same. otherwise, return false
	 */

	@Test
	void testSame() {
		assertTrue(same("hi", "hi"));
		String a = new String("hi");
		String b = new String("hi");
		assertTrue(same(a, b));		// \nIF THIS TEST FAILS, Google \"checking java strings for equality\"
		
		assertFalse(same("super", "super!"));
		assertFalse(same("super", "Super"));
		assertTrue(same("super nintendo CHALMERS!!!", "super nintendo CHALMERS!!!"));
		assertFalse(same("Hello world","Hello_world"));
	}
}