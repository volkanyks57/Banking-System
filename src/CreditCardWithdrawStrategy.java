public class CreditCardWithdrawStrategy implements WithdrawStrategy{

    @Override
    public void withdraw (Account account, double amount) {
      CreditCardAccount creditCardAccount = (CreditCardAccount) account;
      if (amount > 0) {
        double availableCredit = creditCardAccount.getBalance() + creditCardAccount.getDebt();
        if (amount <= availableCredit) {
          creditCardAccount.setDebt(creditCardAccount.getDebt() + amount);
          creditCardAccount.setBalance(creditCardAccount.getBalance() - amount);
          System.out.println(amount + " TL withdrawn from your credit card account. Current balance: " + creditCardAccount.getBalance() + " TL, current debt: " + creditCardAccount.getDebt() + " TL");
        } 
        else {
          System.out.println("Insufficient balance!");
        }
      }
      else {
        System.out.println("Invalid amount!");
      }
    }
}
