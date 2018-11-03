package com.fdmgroup.bank.Customer;

import java.math.BigDecimal;

public class Person extends Customer {

	public Person(String name, String address,int taxId) {
		super(name, address,taxId);
	}
	
	public void resetAllBalances(){
		for (Account accts : accounts){
			accts.correction(new BigDecimal(0));
		}
	}
	

}
