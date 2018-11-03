package com.fdmgroup.bank.Customer;

import java.util.ArrayList;

import com.fdmgroup.bank.Customer.Customer;

public class Bank {
	private ArrayList<Account> allAccounts = new ArrayList<Account>();
	private ArrayList<Customer> allCustomers = new ArrayList<Customer>();

	public ArrayList<Account> getAllaccounts() {
		return allAccounts;
	}

	public void setAccount(Account newAccount) {
		allAccounts.add(newAccount);
	}

	public ArrayList<Customer> getAllCustomers() {
		return allCustomers;
	}

	public void setCustomer(Customer newCustomer) {
		allCustomers.add(newCustomer);
		ArrayList<Account> toBeAdded=newCustomer.getAccounts();
		if(!toBeAdded.isEmpty()){
			for(Account account : toBeAdded){
				this.setAccount(account);
			}
		}

	}

	public Customer getCustomerFromId(int customerid) {
		for (Customer customer : allCustomers) {
			if (customer.getGenId() == customerid) {
				return customer;
			}
		}
		return null;

	}
	public void removeAccount(Account account) {
		if (allAccounts.contains(account)) {
			allAccounts.remove(account);
		} else {
			throw new IllegalArgumentException("This bank does not hold the selected account!");
		}
	}


	public void removeCustomer(Customer customer) {
		if(allCustomers.contains(customer)){
			ArrayList<Account> toBeDeletedAccts = customer.getAccounts();
			if (!toBeDeletedAccts.isEmpty()) {
				for (Account account : toBeDeletedAccts) {
					this.removeAccount(account);
				}
			}
			allCustomers.remove(customer);
		} else {
			throw new IllegalArgumentException("That Customer does not go to this Bank!");
		}
		}
		
	

}
