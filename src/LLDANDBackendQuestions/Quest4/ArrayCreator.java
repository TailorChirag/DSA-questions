package LLDANDBackendQuestions.Quest4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {

    int number;


    public ArrayCreator(int number){
        this.number = number;
    }
    @Override
    public List<Integer> call() throws Exception {
        List<Integer> CreateArray = new ArrayList<>();
        for(int i = 1; i<=this.number; i++){
            CreateArray.add(i);
        }
        return CreateArray;
    }
}
