import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("\n**************\n");

        AccountParams studentParams = new AccountParams();
        studentParams.accountNumber = "12345";
        studentParams.balance = 500;
        studentParams.studentId = "S52314";

        Account studentAccount = AccountFactory.createAccount("Student", studentParams);
        studentAccount.deposit(100);
        studentAccount.withdraw(100);
        //studentAccount.suspend();
        studentAccount.withdraw(150);
        System.out.println(studentAccount.getAccountNumber() + " numaralı hesabınızın güncel bakiyesi: " + studentAccount.getBalance());

        System.out.println("\n**************\n");

        AccountParams standardParams = new AccountParams();
        standardParams.accountNumber = "67890";
        standardParams.balance = 1000;
        standardParams.commission = 5;

        Account standardAccount = AccountFactory.createAccount("Standard", standardParams);
        standardAccount.deposit(500);
        standardAccount.withdraw(200);
        //standardAccount.close();
        standardAccount.withdraw(5000);
        System.out.println(standardAccount.getAccountNumber() + " numaralı hesabınızın güncel bakiyesi: " + standardAccount.getBalance());

        System.out.println("\n**************\n");

        List<String> portfolio = new ArrayList<>();
        portfolio.add("Hisse Senedi");
        portfolio.add("VIOP");

        AccountParams investorParams = new AccountParams();
        investorParams.accountNumber = "54321";
        investorParams.balance = 2000;
        investorParams.investment = "Gold";
        investorParams.unitPrice = 10.0;
        investorParams.portfolio = portfolio;
        investorParams.quantity = 5;

        Account investorAccount = AccountFactory.createAccount("Investor", investorParams);
        investorAccount.deposit(5000);
        investorAccount.deposit(500);
        //investorAccount.suspend();
        investorAccount.withdraw(2000);
        portfolio.add(investorParams.investment);
        System.out.println("Yatırım portföyü: " + ((InvestorAccount) investorAccount).getPortfolio());
        System.out.println("Yatırım portföyü değeri: " + ((InvestorAccount) investorAccount).total() + "\n");

        System.out.println("\n**************\n");

        AccountParams goldParams = new AccountParams();
        goldParams.accountNumber = "98765";
        goldParams.balance = 0;
        goldParams.goldBalance = 50;

        Account goldAccount = AccountFactory.createAccount("Gold", goldParams);
        goldAccount.deposit(500);
        goldAccount.withdraw(80);
        goldAccount.deposit(200);
        System.out.println("Current gold balance: " + ((GoldAccount) goldAccount).getGoldBalance() + " gram");

        System.out.println("\n**************\n");


        AccountParams creditParams = new AccountParams();
        creditParams.accountNumber = "14463";
        creditParams.balance = 10000;
        creditParams.debt = 0;
        creditParams.minPaymentAmount = 0;

        Account creditCardAccount = AccountFactory.createAccount("Credit Card", creditParams);
        creditCardAccount.withdraw(500);
        creditCardAccount.withdraw(300);
        creditCardAccount.deposit(400);
        System.out.println("Current debt: " + ((CreditCardAccount) creditCardAccount).getDebt());

        System.out.println("\n**************\n");


        creditCardAccount.deposit(1500);
        creditCardAccount.withdraw(3000);

        System.out.println("\n**************\n");

        creditCardAccount.suspend();
        creditCardAccount.deposit(200);  // "Cannot deposit to a suspended account."
        creditCardAccount.activate();

        creditCardAccount.withdraw(1000);  // Withdrawal is successful
        creditCardAccount.close();
        creditCardAccount.deposit(500);

        System.out.println("\n**************\n");

    }
}
