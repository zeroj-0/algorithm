package swprogramming;

public abstract class AccountInformation {
    protected double balance;
    protected String account;
//    protected double initialDeposit;

    public AccountInformation(double initial) {
        this.balance = initial;
    }

    public void deposite(int amount) {
        balance += amount;
        System.out.println("입금 후 잔액확인 : "+balance+"원");
    }

    public abstract void withDraw(double amount) throws OverdraftException;
}
