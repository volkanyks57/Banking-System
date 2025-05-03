public class GoldDepositStrategy implements DepositStrategy {
    private final double gramGold = 0.08;

    @Override
    public void deposit(Account account, double amount) {
        if (amount > 0) {
            GoldAccount goldAccount = (GoldAccount) account;
            goldAccount.setGoldBalance(goldAccount.getGoldBalance() + (amount * gramGold));
            System.out.println((amount * gramGold) + " grams of gold deposited. Current gold balance: " + goldAccount.getGoldBalance() + " gram");
        }
        else {
            System.out.println("Invalid amount!");
        }
    }
}