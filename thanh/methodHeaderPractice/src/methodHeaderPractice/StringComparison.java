package methodHeaderPractice;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class StringComparison {
	public static boolean same(String a, String b) {
		return false; //to be completed
	}

	@Test
	void testSame() {
		assertTrue(same("hi", "hi"));
		String a = new String("hi");
		String b = new String("hi");
		assertTrue(same(a, b), "\nIF THIS TEST FAILS, Google \"checking java strings for equality\"");
		
		assertFalse(same("super", "super!"));
		assertFalse(same("super", "Super"));
		assertTrue(same("super nintendo CHALMERS!!!", "super nintendo CHALMERS!!!"));
	}
}
