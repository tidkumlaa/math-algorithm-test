package main.tidkumlaa.math;

import main.tidkumlaa.array.ArrayHelper;
/**
 * 
 * @author Jessadaporn Jampakaew
 *
 */
public class MathUtil {
	
	public static int gcd(int[] a) {
		
		int result = 1;
		
		int max = ArrayHelper.max(a);
		int num = 2;
		int[] b = new int[a.length];
		
		while(num <= max) {
			
			boolean checked = true;
			
			for(int i = 0; i < a.length; i++) {
				
				if(a[i] == 1) {
					
					checked = checked && false;
					
					b[i] = a[i];
					
				}else if(a[i] % num == 0){
					
					checked = checked && true;
					
					b[i] = a[i]/num;
					
				}else {
					
					checked = checked && false;
					
					b[i] = a[i];
				}
			}

			if(checked == true) {
				
				a = b;
				b = new int[a.length];
				
				result = result*num;
				
			}else {
				
				num++;
			}
		}
		
		return result;
	}

	public static int lcm(int[] a) {
		int result = 1;
		
		int max = ArrayHelper.max(a);
		int num = 2;
		int[] b = new int[a.length];
		
		while(num <= max) {
			
			boolean checked = false;
			
			for(int i = 0; i < a.length; i++) {
	
				if(a[i] % num == 0) {
					checked = true;
					b[i] = a[i]/num;
				}else {
					b[i] = a[i];
				}
			}
			
			if(checked == true) {
				
				result *= num;
				num = 2;
			}else {
				num++;
			}
			
			a = b;
			b = new int[a.length];
			
		}
		
		return result;
	}
	
	public static int factorial(int n) {
		
		int result = 0;
		
		if(n == 0) {return 1;}
		if(n > 0) {
			
			return n*factorial(n-1);
		}
		
		return result;
		
	}
}
