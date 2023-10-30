package Backend.DesignPattern.Adapter;

public class ICICIBankAPIAdapter implements BankApiAdapter{
    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }
}
