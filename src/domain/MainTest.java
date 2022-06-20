package com.varxyz.banking.domain;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		Account account = new CheckingAccount(5000.0, 20000.0);
		Account account2 = new SavingsAccount(10000.0);
		
		account.deposite(2000);
		
		try {
			account.withdraw(30000);
		} catch (LoanLimitException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			account.withdraw(5000);
		} catch (LoanLimitException e) {
			System.out.println(e.getMessage());
		}
		
		
		CustomerService customerservice = new CustomerServiceImple();
		Customer c1 = new Customer("홍길동","990930-2700000","010-1111-2222","abcd1234","abcd12345");
		Customer c2 = new Customer("김길동","980930-2700000","010-1111-2222","abcd1234","abcd12345");
		Customer c3 = new Customer("서길동","970930-2700000","010-1111-2222","abcd1234","abcd12345");
		
//		customerservice.addCustomer(new Customer("홍길동","990930-2700000","010-1111-2222","abcd1234","abcd12345"));
//		customerservice.addCustomer(new Customer("김길동","980930-2700000","010-1111-2222","abcd1234","abcd12345"));
//		customerservice.addCustomer(new Customer("서길동","970930-2700000","010-1111-2222","abcd1234","abcd12345"));
		
		customerservice.getCustomerBySsn("990930-2700000");
		System.out.println(customerservice.getCustomerBySsn("990930-2700000").getSsn());
		
		for(Customer c : customerservice.getAllCustomers()) {
			System.out.println(c.getName());
		}
		
		AccountService accountService = new AccountServiceImpl();
//		Account makeAccount = new CheckingAccount("3952", 20000.0,30000.0);
//		Account makeAccount2 = new CheckingAccount("3953", 24000.0,20000.0);
		AccountServiceImpl createAccount = new AccountServiceImpl();
		createAccount.createCheckingAccount("3952", 20000.0,30000.0);
		createAccount.createCheckingAccount("3953", 24000.0,20000.0);
//		accountService.addAccount(makeAccount);
//		accountService.addAccount(makeAccount2);
		accountService.addAccount(createAccount.createCheckingAccount("3952", 20000.0,30000.0));
		accountService.addAccount(createAccount.createCheckingAccount("3953", 24000.0,20000.0));
		
		accountService.getAccountByAccountNum("3952");
		System.out.println(accountService.getAccountByAccountNum("3952").getAccountNum());
	}

}
