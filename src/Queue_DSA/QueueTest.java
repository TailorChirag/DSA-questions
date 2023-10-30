package Queue_DSA;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) throws Exception{
//        Queue q = new Queue();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.enqueue(6);
//        q.dequeue();
//        q.dequeue();
//        q.display();
        String A = "abadbc";
        HashMap<Character,Integer> map = new HashMap<>();
        Deque<Character> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
             if(!map.containsKey(c)){
                 dq.addLast(c);
             }
             map.put(c, map.getOrDefault(c,0)+1);
             while(!dq.isEmpty() && map.get(dq.peekFirst())>1){
                 dq.removeFirst();
             }
             if(dq.isEmpty())sb.append("#");
             else sb.append(dq.peekFirst());
        }
        System.out.println(sb.toString());

    }
}
