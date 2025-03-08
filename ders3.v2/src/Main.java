
public class Main {

    public static void main(String[] args) {

        SavingsAccount vadeli = new SavingsAccount("Ferhat Yılmaz", 4200);
        CheckingAccount vadesiz = new CheckingAccount("Mehmet Işık", 5000);

        vadeli.calculateInterest();
        vadesiz.calculateInterest();





    }
}