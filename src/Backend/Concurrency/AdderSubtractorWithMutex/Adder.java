package Backend.Concurrency.AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Lock lock;

    public Adder(Count count,Lock lock ){
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            lock.lock();
            count.value += i;
            lock.unlock();
        }
    }
}
