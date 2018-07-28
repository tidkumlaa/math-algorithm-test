package test.tidkumlaa.math;

/**
 * 
 * @author Jessadaporn Jampakaew
 *
 */
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import main.tidkumlaa.math.MathUtil;

public class Mathgcd {

	@Test
	public void testGcd() {
		
		assertEquals(2, MathUtil.gcd(new int[] {2, 4}));
		assertEquals(2, MathUtil.gcd(new int[] {4, 6}));
		assertEquals(2, MathUtil.gcd(new int[] {4, 6, 12}));
		assertEquals(3, MathUtil.gcd(new int[] {3, 12, 15}));
		assertEquals(14, MathUtil.gcd(new int[] {14, 56, 28}));
	}

}
