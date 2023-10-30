package Backend.Concurrency.Thread;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            TableCreator task = new TableCreator(i);
            ScalerThread thread = new ScalerThread(task);
            thread.start();
        }

    }
}
