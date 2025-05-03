import java.util.List;

public class InvestorAccount extends Account {
    private String investment;
    private double unitPrice;
    private List<String> portfolio;
    private int quantity;

    public InvestorAccount(String accountNumber, double balance, String investment, double unitPrice, List<String> portfolio, int quantity) {
        super(accountNumber, balance);
        this.investment = investment;
        this.unitPrice = unitPrice;
        this.portfolio = portfolio;
        this.quantity = quantity;
        this.depositStrategy = new InvestorDepositStrategy();
        this.withdrawStrategy = new InvestorWithdrawStrategy();
    }

    public double total() {
        return getBalance() + (unitPrice * quantity);
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public List<String> getPortfolio(){
        return portfolio;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void addToPortfolio(){
        portfolio.add(investment);
        System.out.println((unitPrice * quantity) + " TL worth of " + investment + " investment was made");
    }
}