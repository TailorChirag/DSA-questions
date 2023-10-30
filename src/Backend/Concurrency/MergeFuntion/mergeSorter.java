package Backend.Concurrency.MergeFuntion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mergeSorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executorService;

    public mergeSorter(List<Integer> arraytoSort,ExecutorService executorService){
        this.arrayToSort = arraytoSort;
        this.executorService = executorService;
    }
@Override
    public List<Integer> call() throws Exception{
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }
        else{
            int mid = arrayToSort.size()/2;
            List<Integer> leftArray = new ArrayList<>();
            List<Integer> rightArray = new ArrayList<>();
            for(int i = 0; i<mid; i++){
                leftArray.add(arrayToSort.get(i));
            }
            for(int i = mid; i<arrayToSort.size(); i++){
                rightArray.add(arrayToSort.get(i));
            }

            mergeSorter leftSorter = new mergeSorter(leftArray, executorService);
            mergeSorter rightSorter = new mergeSorter(rightArray, executorService);

//            List<Integer> leftSortedArray = leftSorter.call();
//            List<Integer> rightSortedArray = rightSorter.call();

            Future<List<Integer>> leftSortedArray = executorService.submit(leftSorter);
            Future<List<Integer>> rightSortedArray = executorService.submit(rightSorter);
            List<Integer> finalSortedArray = new ArrayList<>();

            int i=0;
            int j=0;
            while(i<leftSortedArray.get().size() && j<rightSortedArray.get().size()){
                if(leftSortedArray.get().get(i) <= rightSortedArray.get().get(j)){
                    finalSortedArray.add(leftSortedArray.get().get(i));
                    i++;
                }
                else{
                    finalSortedArray.add(rightSortedArray.get().get(j));
                    j++;
                }
            }
            while(i<leftSortedArray.get().size()){
                finalSortedArray.add(leftSortedArray.get().get(i));
                i++;
            }
            while (j<rightSortedArray.get().size()){
                finalSortedArray.add(rightSortedArray.get().get(j));
                j++;
            }
            return finalSortedArray;

        }
    }
}
