package Backend.threadPractise;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("HelloWorld \nChirag is coding");
    }
}
