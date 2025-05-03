public class StandardWithdrawStrategy implements WithdrawStrategy {
    private double commission;

    public StandardWithdrawStrategy(double commission) {
        this.commission = commission;
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - (amount + commission));
            System.out.println(amount + " TL withdrawn. Current balance: " + account.getBalance() + " TL");
        }
        else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}