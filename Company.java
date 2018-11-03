package com.fdmgroup.bank.Customer;


import java.math.BigDecimal;

public class Company extends Customer {
	

	public Company(String name, String address,int taxId) {
		super(name, address,taxId);
	}
	
	
	public void depositAllAccounts(BigDecimal amount){
		for(Account accts: accounts){
			accts.deposit(amount);
		}
	}

}
