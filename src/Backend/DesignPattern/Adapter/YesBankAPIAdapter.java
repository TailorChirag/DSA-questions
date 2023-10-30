package Backend.DesignPattern.Adapter;

public class YesBankAPIAdapter implements BankApiAdapter{
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
