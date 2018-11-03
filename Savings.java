package com.fdmgroup.bank.Customer;

import java.math.BigDecimal;

public class Savings extends Account {

	private BigDecimal INTEREST_RATE = new BigDecimal(0);

	public Savings(String name) {
		super(name);

	}

	public BigDecimal deposit(BigDecimal depositeAmount) {
		balance = balance.add(depositeAmount);
		return balance;

	}

	public BigDecimal withdraw(BigDecimal withdrawalAmount) {
		if (withdrawalAmount.compareTo(balance) > 0) {
			return null;
		} else {
			return super.withdraw(withdrawalAmount);
		}

	}

	public BigDecimal getINTEREST_RATE() {
		return INTEREST_RATE;
	}

	public void setINTEREST_RATE(BigDecimal iNTEREST_RATE) {
		INTEREST_RATE = iNTEREST_RATE;
	}

}
