package Backend.threadPractise;

public class NumberPrinter implements Runnable{
    int number;
    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Numbber is = " + this.number  + " " +Thread.currentThread().getName() );
    }
}
