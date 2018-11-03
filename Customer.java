package com.fdmgroup.bank.Customer;

import java.util.ArrayList;

public abstract class Customer extends Bank {
	private static final int CUSTOMER_ID_NUM = 2000000;
	private static int accountId = CUSTOMER_ID_NUM;
	private static final int INCREMENT_BY = 7;
	private int genId;

	protected String name;
	protected String address;
	protected int taxId;
	protected ArrayList<Account> accounts = new ArrayList<Account>();

	public Customer(String name, String address, int taxId) {
		this.name = name;
		this.address = address;
		this.taxId = taxId;
		genId = accountId;
		accountId = accountId + INCREMENT_BY;
	}

	public int gettaxId() {
		return taxId;
	}

	public void settaxId(int newId) {
		taxId = newId;
	}

	public int getGenId() {
		return genId;
	}

	public void removeAccounts() {
		accounts.clear();
		
	}

	public void addAccount(Account name) {
		accounts.add(name);
	}
	public ArrayList<Account> getAccounts(){
		return accounts;
	}

}
