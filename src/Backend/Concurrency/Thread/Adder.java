package Backend.Concurrency.Thread;


public class Adder implements Runnable {
    int num1 , num2;
    public Adder(int num1 ,int num2 ){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void run(){
        System.out.println(this.num1+this.num2);
    }
}