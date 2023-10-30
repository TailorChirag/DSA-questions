package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        // comparator inbuild func to reverse the ordering
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        q.offer(10);
        q.offer(1);
        q.offer(8);
        q.offer(17);
        q.offer(9);

        System.out.println(q);
        System.out.println(q.peek());
        q.poll();

        System.out.println(q);
        System.out.println(q.peek());
    }
}
