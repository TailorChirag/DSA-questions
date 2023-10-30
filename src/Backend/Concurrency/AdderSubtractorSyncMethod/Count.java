package Backend.Concurrency.AdderSubtractorSyncMethod;

public class Count {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void incrementValue(int offSet){
        this.value += offSet;
    }
}
