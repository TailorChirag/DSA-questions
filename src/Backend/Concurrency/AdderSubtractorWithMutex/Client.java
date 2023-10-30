package Backend.Concurrency.AdderSubtractorWithMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws Exception {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder task1 = new Adder(count,lock);
        Subractor task2 = new Subractor(count,lock);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count value = " + count.value);
    }
}
