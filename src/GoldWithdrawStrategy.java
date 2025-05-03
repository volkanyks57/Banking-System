public class GoldWithdrawStrategy implements WithdrawStrategy {
    private final double TLGold = 12.25;

    @Override
    public void withdraw(Account account, double amount) {
        GoldAccount goldAccount = (GoldAccount) account;
        if (amount > 0 && amount <= goldAccount.getGoldBalance()) {
            goldAccount.setGoldBalance(goldAccount.getGoldBalance() - amount);
            System.out.println((amount * TLGold) + " TL withdrawn. Current gold balance: " + goldAccount.getGoldBalance() + " gram");
        }
        else {
            System.out.println("Insufficient gold balance or invalid amount!");
        }
    }
}