package Foundations;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import junit.framework.Assert;

public class java05StringMethodsProject {
	/**
	 * Bank Transaction Message (Ex: Transaction TN1230000001 was successfully completed),
	 *  Bank Transaction Status (Pending),
	 *  BusinessName and Amount
	 */
	String actualBankTransactionMessage ="Transaction TN1230000001 was successfully completed";
	String actualBankTransactionStatus ="Pending";
	String actualBankBusinessName ="ABC Ltd.";
	String actualBankAmount ="$100000";

	@Before
	public void beforeTest()
	{
		System.out.println("*** Run test :" +name.getMethodName());
	}

	@After
	public void afterTest()
	{
		System.out.println("*** test run completed :" +name.getMethodName());
	}

	@Rule
	public TestName name  = new TestName();


	/**
	 * 
	 */
	@Test
	public void test01TransactionLowerUpperCase() {
		String strLowercase =	actualBankTransactionMessage.toLowerCase();
		System.out.println(strLowercase);
		String strUppercase =	actualBankTransactionMessage.toUpperCase();
		System.out.println(strUppercase);
	}


	@Test
	public void test02TransactionIgnoreCase() {
		try {
			String expectedBankTransactionStatus = "pending";
			Assert.assertTrue(expectedBankTransactionStatus.equalsIgnoreCase(actualBankTransactionStatus));
			//Assert.assertEquals(expectedBankTransactionStatus, actualBankTransactionStatus);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");

		}
	}

	@Test
	public void test03TransactionContains() {
		try {
			String expected = "successfully completed";
			boolean actual = actualBankTransactionMessage.contains(expected);
			Assert.assertTrue(actual);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			//Assert.fail();
		}
	}

	@Test
	public void test04TransactionStartWith() {
		try {
			String expected = "Transaction TN1230000001";
			boolean actual = actualBankTransactionMessage.startsWith(expected);
			Assert.assertTrue(actual);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			//Assert.fail();
		}
	}
	@Test
	public void test05TransactionEndWith() {
		try {
			String expected = "completed";
			boolean actual = actualBankTransactionMessage.endsWith(expected);
			Assert.assertTrue(actual);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			//Assert.fail();
		}
	}
	@Test
	public void test06TransactionEmpty() {
		try {
			String APIBankTransactionMsg = "Transaction TN1230000001 was successfully completed";
			boolean empty = APIBankTransactionMsg.isEmpty();
			Assert.assertTrue(empty);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			//Assert.fail();
		}
	}

	@Test
	public void test07TransactionNull() {
		try {
			String APIBankTransactionMsg = null;
			boolean nullValue = (APIBankTransactionMsg != null);
			System.out.println("APIBankTransactionMsg: " +APIBankTransactionMsg);

			Assert.assertTrue(nullValue);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			//Assert.fail();
		}
	}
	
	
	@Test
	public void test08TransactionMatch() {
		try {
			actualBankBusinessName ="ABC Ltd.";
			boolean nullValue = (actualBankBusinessName != null);
			System.out.println("APIBankTransactionMsg: " +actualBankBusinessName);

			Assert.assertTrue(nullValue);
			System.out.println("Test Passed...");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			//Assert.fail();
		}
	}
}
