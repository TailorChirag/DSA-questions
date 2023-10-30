package Backend.Concurrency.ProducerConsumer_Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private  int maxSize;
    private String name;
    private Queue<Object> store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;


    public Consumer(int maxSize, String name, Queue<Object> store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.maxSize = maxSize;
        this.name = name;
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.name + " Removing a shirt " + this.store.size());
            this.store.remove();
            producerSemaphore.release();
        }
    }
}
