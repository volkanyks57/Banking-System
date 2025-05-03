public class GoldAccount extends Account {
    private double goldBalance;

    public GoldAccount(String accountNumber, double balance, double goldBalance) {
        super(accountNumber, balance);
        this.goldBalance = goldBalance;
        this.depositStrategy = new GoldDepositStrategy();
        this.withdrawStrategy = new GoldWithdrawStrategy();
    }

    public double getGoldBalance() {
        return goldBalance;
    }

    public void setGoldBalance(double goldBalance) {
        this.goldBalance = goldBalance;
    }
}