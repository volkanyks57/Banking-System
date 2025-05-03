public class StandardDepositStrategy implements DepositStrategy {
    private double commission;

    public StandardDepositStrategy(double commission) {
        this.commission = commission;
    }

    @Override
    public void deposit(Account account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + (amount - commission));
            System.out.println(amount + " TL has been deposited. Current balance: " + account.getBalance() + " TL");
        }
        else {
            System.out.println("Invalid amount!");
        }
    }
}