public interface AccountState {

    //tum durumlarin uyması gereken metodlari tanimlar
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    void suspend(Account account);
    void close(Account account);
    void activate(Account account);
}
