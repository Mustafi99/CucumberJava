package Foundations;

import org.junit.Test;

/**
 * 
 * @author MustafizurRahaman
 *
 */

public class java03DataTypes {
/**
 * 2 types - primitive and non primitive
 */
	@Test
	public void testDataTypeprimitive() {
		/*
		 * primitive -int, float, double ,boolean,short
		 */
		int usercount = 1234;
		System.out.println("usercount: " +usercount);
		
		float interestRate = 2.6f;
		System.out.println("interestRate: " +interestRate);
		
		boolean userLogin = false;
		System.out.println("userLogin: " +userLogin);
		
		if(usercount>1000) {
			System.out.println("High Volume of users signed today");
		}
		
	}
	
	@Test
	public void testDataTypeNonprimitive() {
		/*
		 * primitive -String,Integer they are  class
		 */
		String testURL ="www.google.com";
		System.out.println("Test URL : " + testURL);
		
		Integer supportcallcount = 100;
		System.out.println("support call count : " + supportcallcount);
		
		if(supportcallcount.equals(100)) {
			System.out.println("Its time to go home today");
		}
		
	}
	
	
}
