public class Account {

    private String accountNumber;
    private double balance;
    protected DepositStrategy depositStrategy;
    protected WithdrawStrategy withdrawStrategy;
    private AccountState state;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.state = new ActiveState();  // Varsayılan durum: aktif
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public DepositStrategy getDepositStrategy() {
        return depositStrategy;
    }

    public WithdrawStrategy getWithdrawStrategy() {
        return withdrawStrategy;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(this, amount);
    }

    public void withdraw(double amount) {
        state.withdraw(this, amount);
    }

    public void suspend() {
        state.suspend(this);
    }

    public void close() {
        state.close(this);
    }

    public void activate() {
        state.activate(this);
    }
}