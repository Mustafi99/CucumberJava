package Foundations;

import org.junit.Test;

import junit.framework.Assert;

/**
 * 
 * @author MustafizurRahaman
 *
 */
public class Java02Variables {
/**
 * 
 * @param args
 */
	
	static int numberLoginAttempt = 0;
	String testURL ="www.google.com";
	long memberNumber = 123456;
	int passcode = 1234;
	
	
	public static void main(String[] args) {
		

	}
	
	static void loginAttempts() {
		System.out.println("User login attempt: " + (numberLoginAttempt+1));
		String ExpectedMsg = "Account Locked";
		numberLoginAttempt ++;
		try {
			if (numberLoginAttempt == 3) {
				System.out.println(ExpectedMsg);
				Assert.assertEquals(ExpectedMsg, "Account Locked, contact us");
				System.out.println("Test passed");
			} 
		} catch (AssertionError e) {
			System.out.println("Test failed...");
			System.out.println("Message does not match");
			//Assert.fail("Message does not match");
		}
		
	}
	@Test
	public void testvariables() {
		System.out.println("Test URL : " + testURL);
		
		System.out.println("memberNumber:" + memberNumber );
		
		memberNumber =1234555;
		System.out.println("memberNumber:" + memberNumber );
		loginAttempts();
		loginAttempts();
		loginAttempts();
		
		
	}
	
	

}
