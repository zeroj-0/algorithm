package swprogramming;

public class SavingsAccount extends AccountInformation {
    private double interestRate;

    public SavingsAccount(double initial) {
        super(initial);
    }

    @Override
    public void withDraw(double amount) throws OverdraftException {
        if (balance < amount) {
            // 예외처리
            throw new OverdraftException("잔액부족");
        } else {
            balance -= amount;
        }
        System.out.println("출금 후 잔액확인 : "+balance+"원");
    }
}
