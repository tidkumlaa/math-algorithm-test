package test.tidkumlaa.math;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import main.tidkumlaa.math.MathUtil;

public class MathFactorial {

	@Test
	public void testFactorial() {
		assertEquals(1, MathUtil.factorial(0));
		assertEquals(1, MathUtil.factorial(1));
		assertEquals(2, MathUtil.factorial(2));
		assertEquals(6, MathUtil.factorial(3));
		assertEquals(120, MathUtil.factorial(5));
	}

}
