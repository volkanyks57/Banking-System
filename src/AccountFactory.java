public class AccountFactory {
    public static Account createAccount(String accountType, AccountParams params) {
        switch (accountType) {
            case "Student":
                return new StudentAccount(params.accountNumber, params.balance, params.studentId);
            case "Standard":
                return new StandardAccount(params.accountNumber, params.balance, params.commission);
            case "Gold":
                return new GoldAccount(params.accountNumber, params.balance, params.goldBalance);
            case "Investor":
                return new InvestorAccount(params.accountNumber, params.balance, params.investment, params.unitPrice, params.portfolio, params.quantity);
            case "Credit Card":
                return new CreditCardAccount(params.accountNumber, params.balance, params.debt, params.minPaymentAmount);
            default:
                throw new IllegalArgumentException("Invalid account type: " + accountType);
        }
    }
}