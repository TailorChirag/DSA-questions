package Backend;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    double getSimpleInterest(int Time){
        return (this.balance*this.roi*Time)/100;
    }
    double getBalanceWithInterest(int Time){
        return this.balance+getSimpleInterest(Time);
    }
}
