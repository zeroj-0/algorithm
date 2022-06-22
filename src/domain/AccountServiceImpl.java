package domain;

import java.util.*;

public class AccountServiceImpl implements AccountService {
	private static AccountService accountService = new AccountServiceImpl();

	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	public AccountServiceImpl() {
		customerService = CustomerServiceImple.getInstance();
	}

	public static AccountService getInstance() {
		return accountService;
	}
	
	// option! 객체 만들어주는 메소드 (반복할필요x, main가서 객체생성할 필요 없이 메소드로 !)
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		Customer customerSsn = customerService.getCustomerBySsn(ssn);
		List<Account> cusList = customerSsn.getMyAccountList();
		
		return cusList;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account account : accountList) {
			if(accountNum.equals(account.getAccountNum())) {
				return account;
			}
		}
		return null;
	}
}
