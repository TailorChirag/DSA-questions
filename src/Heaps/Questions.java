package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Questions {
    public static boolean median(ArrayList<Integer> A){
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        max.offer(A.get(0));
        for(int i=1; i<A.size(); i++){
            if(A.get(i)<= max.peek()){
                max.offer(A.get(i));
            }
            else {
                min.offer(A.get(i));
            }
            int checkSize = max.size() - min.size();
            if(max.size()<min.size()){
                max.offer(min.poll());
            }
            else if(checkSize>1){
                min.offer(max.poll());
            }
            if(max.size()==min.size()){
                double ans = (double)(max.peek()+min.peek())/2;
                if(ans==A.get(i+1)) return true;
            }
            else{
                if(max.peek().equals(A.get(i+1))) return true;
            }
        }
        return false;

    }
    public static void connectRopes(){
        int[] A = {16,7,3,5,9,8,6,15};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        for(int i=0; i<A.length; i++){
            pq.offer(A[i]);
        }
        System.out.println(pq);
        ArrayList<Integer> ch = new ArrayList<>();
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int a = first + second;
            pq.offer(a);
            ch.add(ans);
            ans += a;
        }
        System.out.println(ans);
        System.out.println();
        for (int i=0; i< ch.size();i ++){
            System.out.print(ch.get(i) +" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(6);
        A.add(8);
        A.add(4);
//        A.add(3);




    }
}
