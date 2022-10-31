package Foundations;

import org.junit.Test;

/**
 * 
 * @author MustafizurRahaman
 *
 */
public class java04Typecasting {
	
	/**
	 * Narrow Casting- larger type to a smaller type.
	 *  Double to int - explicitly
	 */
	@Test
	public void testTypecastingNarrow(){
		int one  = 1;
		double two = one;
		System.out.println(one);
		System.out.println(two);

	}
	
	/**
	 * Widneing Casting- smaller type to a larger type.
	 * int to Double (automatically)
	 */
	@Test
	public void testTypecastingWide(){
		
		double doubletwo = 11.45;
		int one  = (int) doubletwo;
		
		System.out.println(doubletwo);
		System.out.println(one);

	}
}