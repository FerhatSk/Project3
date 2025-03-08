
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, int balance) {
        super(accountHolder, balance);
    }


    @Override
    public void calculateInterest() {
        double interest=balance*0.05;
        balance += interest;

        System.out.println("Yeni bakiye: "+balance);
    }
}
