package Backend.Concurrency.AdderSubtractorwithSync;

public class Subractor implements Runnable{
    Count count;

    public Subractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            synchronized (count) {
                count.value -= i;
            }
        }
    }
}
