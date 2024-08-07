package Backend.DesignPattern.Adapter;

public interface BankApiAdapter {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromAccount,String toAccount,double amount);
}
