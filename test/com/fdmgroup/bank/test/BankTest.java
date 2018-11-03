package com.fdmgroup.bank.test;

import com.fdmgroup.bank.Customer.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	private Bank classUnderTest;
	private Bank classUnderTest2;
	Account acctname;
	Account acctname2;
	Person mockPerson;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Bank();
		classUnderTest2 = new Bank();
		acctname = new Savings("Corey");
		acctname2 = new Checking("Corey");
		mockPerson = new Person("Corey", "Queens", 12);
	}

	@Test
	public void testinstanceofBank() {
		assertTrue(classUnderTest instanceof Bank);
	}

	@Test
	public void testSetAccount() {
		Account acctname2 = new Checking("Vinicio");
		classUnderTest.setAccount(acctname2);
		assertFalse(classUnderTest.getAllaccounts() == null);
	}

	@Test
	public void testGetAccounts() {
		assertTrue(classUnderTest.getAllaccounts().isEmpty());
	}

	@Test
	public void testRemoveAccount() {
		classUnderTest.setAccount(acctname);
		classUnderTest.setAccount(acctname2);
		classUnderTest.removeAccount(acctname2);
		assertFalse(classUnderTest.getAllaccounts().contains(acctname2));
	}

	@Test
	public void testRemoveCustomer() {
		mockPerson.addAccount(acctname);
		classUnderTest2.setCustomer(mockPerson);
		classUnderTest2.removeCustomer(mockPerson);
		assertTrue(classUnderTest2.getAllCustomers().isEmpty());
	}

}
