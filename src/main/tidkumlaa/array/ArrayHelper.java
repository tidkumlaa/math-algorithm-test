package main.tidkumlaa.array;

/**
 * 
 * @author Jessadaporn Jampakaew
 *
 */
public class ArrayHelper {

	public static int max(int[] a) {
		int max = Integer.MIN_VALUE ;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
}
