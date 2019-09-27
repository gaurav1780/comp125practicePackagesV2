package methodHeaderPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question38 {
	/**
	 * @param str
	 * @param ch
	 * @return number of the character ch in the string str
	 * @return 0 if the string is null or empty
	 */

	@Test
	void testCount() {

		assertEquals(0, count(null, '0')); 
		assertEquals(0, count("", '0'));
		assertEquals(3, count("Hello World",'l'));
		assertEquals(2, count("Super Super",'p'));
		assertEquals(2, count("1Two3Four5",'o'));
		assertEquals(1, count(" What's your name?",'s'));
		assertEquals(2, count("/usr/tmp/package1/Java_programing/",'m'));

	}
}
