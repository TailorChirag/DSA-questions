package LLDANDBackendQuestions.Quest4;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        ArrayCreator arrayCreator = new ArrayCreator(number);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> createArray = executorService.submit(arrayCreator);
        System.out.println("this is the array " + createArray.get() );
    }
}
