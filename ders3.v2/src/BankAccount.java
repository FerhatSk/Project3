abstract class BankAccount {

    protected String accountHolder;
    protected int balance;

    public BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void calculateInterest();







}
