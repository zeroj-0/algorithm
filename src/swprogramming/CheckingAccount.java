package swprogramming;

public class CheckingAccount extends AccountInformation {
    private double overdraftAmount;

    public CheckingAccount(double initial, double overdraft) {
        super(initial);
        this.overdraftAmount = overdraft;
    }

    @Override
    public void withDraw(double amount) throws OverdraftException {
        if (balance < amount) {
            if (amount > overdraftAmount) {
                // 대출금액한도 초과 예외처리
                throw new OverdraftException("대출금액한도초과");
            } else {
                overdraftAmount = overdraftAmount - (amount-balance);
                balance = -(amount-balance);
            }
        } else {
            balance -= amount;
        }
        System.out.println("출금 후 잔액확인 : "+balance+"원");
    }
}
