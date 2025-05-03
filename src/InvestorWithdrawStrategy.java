public class InvestorWithdrawStrategy implements WithdrawStrategy {
    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("Withdrawals for investment accounts are not available from our bank. Please try another transaction!");
    }
}