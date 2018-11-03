package com.fdmgroup.bank.Customer;

import com.fdmgroup.bank.Customer.Account;
import java.math.BigDecimal;

public class Checking extends Account {
	private int checknum = 100;

	public Checking(String name) {
		super(name);
	}


	public int getChecknum() {
		return checknum;
	}

	public void setChecknum(int checknum) {
		this.checknum = checknum;
	}

	public int nextChecknum() {
		return checknum + 1;
	}
	public int getgenAccountId() {
		return genAccountId;
	}

	public BigDecimal deposit(BigDecimal depositeAmount) {
		balance = balance.add(depositeAmount);
		return balance;

	}

	public BigDecimal withdraw(BigDecimal withdrawalAmount) {
		balance = balance.subtract(withdrawalAmount);
		return balance;
	}

}
