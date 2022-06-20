package com.varxyz.banking.domain;

import java.util.*;

public interface AccountService {
	void addAccount(Account account);
	void addAccount(Account account, String ssn);
	List<Account> getAccountBySsn(String ssn);
	Account getAccountByAccountNum(String accountNum);
}
