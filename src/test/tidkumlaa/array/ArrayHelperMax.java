package test.tidkumlaa.array;

/**
 * 
 * @author Jessadaporn Jampakaew
 *
 */
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import main.tidkumlaa.array.ArrayHelper;

class ArrayHelperMax extends TestCase{

	private int[] a = new  int[] {1,3,5};
	
	@Test
	void testFindMax() {
		
		assertEquals(5, ArrayHelper.max(a));
		
	}

}
