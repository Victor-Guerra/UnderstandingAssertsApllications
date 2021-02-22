package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		int x = 100;
		int y = 99;
		
		assertEquals(x*y, OtherClass.multiply(x, y));
	}
	
	@Test
	public void testMultiply_ExceptionIsThrown() {
		int x = 1000;
		int y = 11;
		
		try {
			assertEquals(x*y, OtherClass.multiply(x,y));
		} catch(IllegalArgumentException e) {
			assertEquals("X should be less than 1000", e.getMessage());
		}
	}

}
