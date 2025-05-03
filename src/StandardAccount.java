public class StandardAccount extends Account {
    public StandardAccount(String accountNumber, double balance, double commission) {
        super(accountNumber, balance);
        this.depositStrategy = new StandardDepositStrategy(commission);
        this.withdrawStrategy = new StandardWithdrawStrategy(commission);
    }
}