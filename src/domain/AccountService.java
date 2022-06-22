package domain;

import java.util.*;

public interface AccountService {
	void addAccount(Account account);
	void addAccount(Account account, String ssn);
	List<Account> getAccountBySsn(String ssn);
	Account getAccountByAccountNum(String accountNum);
	Account createSavingsAccount(String AccountNum, double balance, double interestRate);
	Account createCheckingAccount(String accountNum, double balance, double overdraftAmount);
}
