class CreditCardDepositStrategy implements DepositStrategy {
    
    @Override
    public void deposit(Account account, double amount) {
        if (amount > 0) {
          CreditCardAccount creditCardAccount = (CreditCardAccount) account;
          double payment = Math.min(amount, creditCardAccount.getDebt());
          creditCardAccount.setDebt(creditCardAccount.getDebt() - payment);
          double remainingBalance = creditCardAccount.getBalance() + payment;
          creditCardAccount.setBalance(remainingBalance);
          System.out.println(payment + " TL debt was paid and remaining balance was increased to " + remainingBalance + " TL. Current balance: " + creditCardAccount.getBalance() + " TL, Current debt: " + creditCardAccount.getDebt() + " TL");
        }
        else {
          System.out.println("Invalid amount!");
        }
      }
  }
  