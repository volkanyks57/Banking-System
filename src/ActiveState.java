public class ActiveState implements AccountState{

    @Override
    public void deposit(Account account, double amount) {
        account.getDepositStrategy().deposit(account, amount);
    }

    @Override
    public void withdraw(Account account, double amount) {
        account.getWithdrawStrategy().withdraw(account, amount);
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account has been suspended.");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account has been closed.");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already active.");
    }
    
}
