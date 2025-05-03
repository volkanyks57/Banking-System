public class CreditCardAccount extends Account {
    private double debt = 0;
    private double minPaymentAmount;

    public CreditCardAccount(String accountNumber, double balance, double debt, double minPaymentAmount) {
        super(accountNumber, balance);
        this.debt = debt;
        this.minPaymentAmount = minPaymentAmount;
        this.depositStrategy = new CreditCardDepositStrategy();
        this.withdrawStrategy = new CreditCardWithdrawStrategy();
    }

    public double getMinPaymentAmount() {
        return minPaymentAmount;
    }

    public void setMinPaymentAmount(double minPaymentAmount) {
        this.minPaymentAmount = minPaymentAmount;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

}
