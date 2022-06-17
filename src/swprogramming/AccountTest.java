package swprogramming;

public class AccountTest {
    public static void main(String[] args) {
        AccountInformation account = new CheckingAccount(5000, 30000);
        AccountInformation account2 = new SavingsAccount(10000);

        account.deposite(3000);
        try {
            account.withDraw(40000);
        } catch (OverdraftException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withDraw(10000);
        } catch (OverdraftException e) {
            System.out.println(e.getMessage());
        }

        account2.deposite(4000);
        try {
            account2.withDraw(13000);
        } catch (OverdraftException e) {
            System.out.println(e.getMessage());
        }
        try {
            account2.withDraw(3000);
        } catch (OverdraftException e) {
            System.out.println(e.getMessage());
        }
    }
}
