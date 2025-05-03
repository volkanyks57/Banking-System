public class InvestorDepositStrategy implements DepositStrategy {
    @Override
    public void deposit(Account account, double amount) {
        if (amount > 1000) {
            System.out.println(amount + " TL has been deposited. Your total account balance: " + (account.getBalance() + amount));
        }
        else {
            System.out.println("You must deposit at least 1000 TL");
        }
    }
}