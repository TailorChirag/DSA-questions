package LLDANDBackendQuestions.Ques3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root,ExecutorService executorService){
        this.root = root;
        this.executorService = executorService;
    }

    public Integer call() throws Exception{
        if(root == null) return 0;
        Future<Integer> left;
        left = executorService.submit(new TreeSizeCalculator(root.left,executorService));
        Future<Integer> right = executorService.submit(new TreeSizeCalculator(root.right,executorService));
        return left.get()+ right.get()+1;
    }
}
