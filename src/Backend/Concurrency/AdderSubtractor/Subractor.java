package Backend.Concurrency.AdderSubtractor;

public class Subractor implements Runnable{
    Count count;

    public Subractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("Hello i am Subtracting");
        for(int i = 1; i <= 10000; i++){
            count.value -= i;
        }
        System.out.println("Okay bye");
    }
}
