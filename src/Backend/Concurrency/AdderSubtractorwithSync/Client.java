package Backend.Concurrency.AdderSubtractorwithSync;

public class Client {
    public static void main(String[] args) throws Exception {
        Count count = new Count();
        Adder task1 = new Adder(count);
        Subractor task2 = new Subractor(count);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count value = " + count.value);
    }
}
