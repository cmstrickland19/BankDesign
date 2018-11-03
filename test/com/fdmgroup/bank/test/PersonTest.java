package com.fdmgroup.bank.test;
import com.fdmgroup.bank.Customer.*;
import java.math.BigDecimal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Person classUnderTest;
	private Person classUnderTest2;
	private String name="Corey";
	private String address="Queens";
	private int taxId;

	@Before
	public void setUp() throws Exception {
		classUnderTest= new Person(name,address,taxId);
		classUnderTest2= new Person(name,address,taxId);
		
	}

	@Test
	public void testInstanceOfPerson() {
		assertTrue(classUnderTest instanceof Person);
	}
	@Test
	public void testAddComAccounts(){
		Account acctname=new Savings(name);
		classUnderTest2.addAccount(acctname);
		assertFalse(classUnderTest.getAllaccounts() == null);
	}
	@Test
	public void testResetAllBalances(){
		Account acctname=new Savings(name);
		Account acctname2=new Savings(name);
		Account acctname3=new Checking(name);
		classUnderTest.addAccount(acctname);
		classUnderTest.addAccount(acctname2);
		classUnderTest.addAccount(acctname3);
		BigDecimal amount= new BigDecimal(100);
		acctname.deposit(amount);
		acctname2.deposit(amount);
		acctname3.deposit(amount);
		classUnderTest.resetAllBalances();
		BigDecimal expected =new BigDecimal(0);
		assertEquals(expected, acctname.getbalance());
		assertEquals(expected, acctname2.getbalance());
		assertEquals(expected, acctname3.getbalance());
		
	}
	

}
