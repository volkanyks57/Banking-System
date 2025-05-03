public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        System.out.println("Cannot deposit to a suspended account.");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("Cannot withdraw from a suspended account.");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended.");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account has been closed.");
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account has been activated.");
    }
}