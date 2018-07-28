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

public class Mathlcm {

	@Test
	public void testLcm() {
		assertEquals(4, MathUtil.lcm(new int[] {2, 4}));
		assertEquals(12, MathUtil.lcm(new int[] {2, 4, 6}));
		assertEquals(24, MathUtil.lcm(new int[] {2, 4, 6, 8}));
	}

}
