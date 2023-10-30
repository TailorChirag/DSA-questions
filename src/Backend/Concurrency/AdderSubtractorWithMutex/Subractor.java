package Backend.Concurrency.AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable{
    Count count;
    Lock lock;

    public Subractor(Count count,Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            lock.lock();
            count.value -= i;
            lock.unlock();
        }
    }
}
