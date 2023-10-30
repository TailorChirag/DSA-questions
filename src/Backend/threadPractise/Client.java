package Backend.threadPractise;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter hello = new HelloWorldPrinter();
//        hello.run();
//        Thread t = new Thread(hello);
//        t.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorServiceCashed = Executors.newCachedThreadPool();

        for(int i =1; i<=100; i++){

            NumberPrinter task =new NumberPrinter(i);
            executorServiceCashed.execute(task);
        }

    }
}
