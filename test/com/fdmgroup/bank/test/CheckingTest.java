package com.fdmgroup.bank.test;

import java.math.BigDecimal;
import com.fdmgroup.bank.Customer.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckingTest {
	private Checking classUnderTest;
	Checking classUnderTest2;
	private String testInput;
	

	@Before
	public void setUp() throws Exception {

		classUnderTest = new Checking(testInput);
		classUnderTest2 = new Checking(testInput);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInstanceOfChecking() {

		assertTrue(classUnderTest instanceof Checking);

	}

	

	@Test
	public void testGetCheckNum() {
		int expected = 100;
		assertTrue(expected <= classUnderTest.getChecknum());
	}
	@Test
	public void testSetCheckNum(){
		int expected=105;
		classUnderTest.setChecknum(105);
		assertTrue(expected==classUnderTest.getChecknum());
		
	}

	@Test
	public void testGetNextCheck() {
		int expected = 101;
		assertTrue(expected == classUnderTest.nextChecknum());
	}

	 @Test
	 public void testIniBalanceZero(){
	 BigDecimal expected =new BigDecimal(0);
	 classUnderTest.correction(new BigDecimal(0));
	 assertEquals(expected, classUnderTest.getbalance());
	 }
	@Test
	public void testDeposit(){
		BigDecimal initialbalance=new BigDecimal(500);
		classUnderTest.deposit(new BigDecimal(500));
		assertTrue(initialbalance.equals(classUnderTest.getbalance()));
	}
	
	@Test
	public void testWithdraw() {
		classUnderTest.withdraw(new BigDecimal(100));
		BigDecimal expected = new BigDecimal(-100);
		assertEquals(expected, classUnderTest.getbalance());
	}

	@Test
	public void testValidId() {

		assertTrue((classUnderTest2.getgenAccountId() - 1000) % 5 == 0);
	}
	
	@Test
	public void testGetGenAccountId() {
		int expected = 0;
		assertTrue(classUnderTest.getgenAccountId() % 5 == expected);
		assertTrue((classUnderTest2.getgenAccountId() - 1000) % 5 == expected);

	}

}
