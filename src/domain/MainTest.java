package domain;

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
		
		
		CustomerService customerservice = CustomerServiceImple.getInstance();
		Customer c1 = new Customer("홍길동","990930-2700000","010-1111-2222","abcd1234","abcd12345");
		Customer c2 = new Customer("김길동","980930-2700000","010-1111-2222","abcd1234","abcd12345");
		Customer c3 = new Customer("서길동","970930-2700000","010-1111-2222","abcd1234","abcd12345");
		
//		customerservice.addCustomer(new Customer("홍길동","990930-2700000","010-1111-2222","abcd1234","abcd12345"));
//		customerservice.addCustomer(new Customer("김길동","980930-2700000","010-1111-2222","abcd1234","abcd12345"));
//		customerservice.addCustomer(new Customer("서길동","970930-2700000","010-1111-2222","abcd1234","abcd12345"));
		
		customerservice.getCustomerBySsn("990930-2700000");
		System.out.println(customerservice.getCustomerBySsn("990930-2700000").getSsn());

		AccountService accountService = AccountServiceImpl.getInstance();

	}

}
