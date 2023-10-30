package Backend.DesignPattern.Adapter;

public class PhonePe {
    private BankApiAdapter bankApi;

    public PhonePe(BankApiAdapter bankApi){
        this.bankApi = bankApi;
    }

    double doSomething() throws Exception{
        double currentBalance  = bankApi.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 1000);
        return currentBalance * 2 ;
    }
}
