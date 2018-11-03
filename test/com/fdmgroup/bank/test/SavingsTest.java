package com.fdmgroup.bank.test;

import java.math.BigDecimal;
import com.fdmgroup.bank.Customer.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingsTest {
	private Savings classUnderTest;
	private Savings classUnderTest2;
	private String testInput;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Savings(testInput);
		classUnderTest2 = new Savings(testInput);
	}

	@Test
	public void testinstanceofSavings() {
		assertTrue(classUnderTest instanceof Savings);
	}

	@Test
	public void testSetInterestRate() {
		BigDecimal expectedRate = new BigDecimal(21);
		classUnderTest.setINTEREST_RATE(new BigDecimal(21));
		assertEquals(classUnderTest.getINTEREST_RATE(), expectedRate);
	}

	@Test
	public void testgetInterestRate() {
		BigDecimal expectedRate = new BigDecimal(0);
		assertEquals(classUnderTest2.getINTEREST_RATE(), expectedRate);
	}

	@Test
	public void testWithdrawOverdraw() {
		BigDecimal expectedAmount = new BigDecimal(0);
		classUnderTest2.withdraw(new BigDecimal(10));
		assertEquals(expectedAmount, classUnderTest2.getbalance());
	}

	@Test
	public void testWithdrawNoOverdraw() {

		BigDecimal expectedAmount = new BigDecimal(0);
		BigDecimal testamount = new BigDecimal(180);

		classUnderTest.withdraw(testamount);
		assertEquals(expectedAmount, classUnderTest.getbalance());

	}
	

}
