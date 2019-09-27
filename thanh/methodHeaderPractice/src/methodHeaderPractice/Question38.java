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
		/* Does these 2 test cases (line 17 and 18) having no passed parameter for char 'something'
		 mean students have to know method overloading? 
		That is, in the first 2 test cases, the function count is:
		public static int count(String str)
		
		and in the third test case onward, the function count is:
		public static int count(String str, char ch)
		
		If not, I'd suggest something like:
		assertEquals(0, count(null, '0')); 
		assertEquals(0, count("", '0'));
		*/
		assertEquals(0, count(null)); 
		assertEquals(0, count(""));
		assertEquals(3, count("Hello World",'l'));
		assertEquals(2, count("Super Super",'p'));
		assertEquals(2, count("1Two3Four5",'o'));
		assertEquals(1, count(" What's your name?",'s'));
		assertEquals(2, count("/usr/tmp/package1/Java_programing/",'m'));

	}
}
