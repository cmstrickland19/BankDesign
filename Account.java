package com.fdmgroup.bank.Customer;

import java.math.BigDecimal;

public abstract class Account {
	private static final int ACCOUNT_ID_NUM = 1000;
	private static int accountId = ACCOUNT_ID_NUM;
	private static final int INCREMENT_BY = 5;
	protected int genAccountId;
	protected BigDecimal balance = new BigDecimal(0);
	private String name;

	public Account(String name, BigDecimal balance) {
		this.balance = balance;
		this.name = name;
		genAccountId=accountId;
		accountId=accountId+INCREMENT_BY;
	}

	public Account(String name) {
		this.name = name;
		genAccountId=accountId;
		accountId=accountId+INCREMENT_BY;
	}
	public Account(){
		genAccountId=accountId;
		accountId=accountId+INCREMENT_BY;
	}

	public BigDecimal deposit(BigDecimal depositeAmount) {
		balance = balance.add(depositeAmount);
		return balance;

	}

	public BigDecimal withdraw(BigDecimal withdrawalAmount) {
		balance = balance.subtract(withdrawalAmount);
		return balance;
	}

	public BigDecimal correction(BigDecimal correctionAmount) {
		balance = correctionAmount;
		return balance;
	}

	public int getgenAccountId() {
		return genAccountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getbalance(){
		return balance;
	}


}
