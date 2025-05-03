public class ClosedState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        System.out.println("Cannot deposit to a closed account.");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("Cannot withdraw from a closed account.");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Cannot suspend a closed account.");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed.");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Cannot activate a closed account.");
    }
}