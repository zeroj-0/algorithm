package com.varxyz.banking.domain;

import java.util.*;

public class CustomerServiceImple implements CustomerService {
	
	private List<Customer> customerList = new ArrayList<Customer>();

	public void addCustomer(Customer customer) {
		if(getCustomerBySsn(customer.getSsn()) == null) {
			customerList.add(customer);
		}
		
	}

	public Customer getCustomerBySsn(String ssn) {
		for(Customer c : customerList) {
			if(ssn.equals(c.getSsn())) {
				return c;
			}
		}
		return null;
	}

	public Collection<Customer> getAllCustomers() {
		return customerList;
	}

	public int getNumOfCustomers() {
		return customerList.size();
	}
	
}
