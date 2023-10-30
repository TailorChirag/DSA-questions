package Backend.Concurrency.AdderSubtractor;

public class Adder implements Runnable{
    Count count;

    public Adder(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("hi I am adding \n");
        for(int i = 1; i <= 10000; i++){
            count.value += i;
        }
        System.out.println("Okay bye");
    }
}
