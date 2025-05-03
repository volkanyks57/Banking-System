public class StudentWithdrawStrategy implements WithdrawStrategy {
    @Override
    public void withdraw(Account account, double amount) {
        if (amount <= 100) {
            if (amount > 0 && amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                System.out.println(amount + " TL withdrawn. Current balance: " + account.getBalance() + " TL");
            }
            else {
                System.out.println("Insufficient balance or invalid amount!");
            }
        }
        else {
            System.out.println("The single withdrawal limit for student accounts is 100 TL.");
        }
    }
}