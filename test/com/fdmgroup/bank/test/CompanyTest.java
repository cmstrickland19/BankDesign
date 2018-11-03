package com.fdmgroup.bank.test;
import com.fdmgroup.bank.Customer.*;
import java.math.BigDecimal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
	private Company classUnderTest;
	private Company classUnderTest2;
	private String name="Corey";
	private String address="Queens";
	private int taxId;
	

	@Before
	public void setUp() throws Exception {
		classUnderTest= new Company(name,address,taxId);
		classUnderTest2= new Company(name,address,taxId);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInstanceof() {
		assertTrue(classUnderTest instanceof Company);
		
	}
	@Test
	public void testAddComAccounts(){
		Account acctname=new Checking(name);
		classUnderTest2.addAccount(acctname);
		assertFalse(classUnderTest.getAllaccounts() == null);
	}
	
	@Test 
	public void testDepositeAllAccounts(){
		Account acctname=new Checking(name);
		Account acctname2=new Checking(name);
		Account acctname3=new Savings(name);
		classUnderTest.addAccount(acctname);
		classUnderTest.addAccount(acctname2);
		classUnderTest.addAccount(acctname3);
		classUnderTest.depositAllAccounts(new BigDecimal (100));
		BigDecimal expected =new BigDecimal(100);
		assertEquals(expected, acctname3.getbalance());
		assertEquals(expected, acctname2.getbalance());
	}

	

}
