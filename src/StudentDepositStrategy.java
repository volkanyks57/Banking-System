public class StudentDepositStrategy implements DepositStrategy{

    @Override
    public void deposit(Account account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println(amount + " TL has been deposited. Current balance: " + account.getBalance() + " TL");
        }
        else {
            System.out.println("Invalid amount!");
        }
    }

}