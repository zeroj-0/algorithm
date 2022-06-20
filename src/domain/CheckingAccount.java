package com.varxyz.banking.domain;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount(double balance, double overdraftAmount) {
		super(balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) throws LoanLimitException {
		if (balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			
			// 대출하려는 돈이 대출한도액보다 클때 예외발생
			if (overdraftAmount < (amount-balance)) {
				throw new LoanLimitException("대출한도 초과");
			} else {				
				// 대출 한도액에다가 잔고보다 부족한 금액 빼서 씀
				overdraftAmount = overdraftAmount - (amount-balance);
				
				// 대출한 금액 통잔잔고에 찍기
				balance = -(amount-balance);
			}
			
		} else {
			balance -= amount;
		}
		System.out.println("출금 후 잔액은: " + balance + "원");
	}
}
