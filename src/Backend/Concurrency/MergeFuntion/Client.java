package Backend.Concurrency.MergeFuntion;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {


        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer> list = Arrays.asList(7,5,41,6,87,32,4,1,9);
        mergeSorter sorter = new mergeSorter(list , executorService);
        Future<List<Integer>> sortedArrayList = executorService.submit(sorter);
        System.out.println("Sorted Arrat list is " + sortedArrayList.get());
        System.out.println("hoo gaya");
    }
}
