package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijKstra_Algo {
    public static void main(String[] args) {
        int A = 6;
        int C = 4;
        int[][] B = {{0, 4, 9},
                {3 , 4 , 6},
                {1 , 2 , 1},
                {2 , 5 , 1},
                {2 , 4 , 5},
                {0 , 3 , 7},
                {0 , 1 , 1},
                {4 , 5 , 7},
                {0 , 5 , 1}};
        ArrayList<Integer> ans = dijkstra(A,B,C);
        for (int i=0; i<ans.size(); i++) System.out.print(ans.get(i)+",");
    }
    static class Pair {
        int Node;
        int w;

        Pair(int Node , int w) {
            this.Node = Node;
            this.w = w;
        }
    }

    public static ArrayList<Integer> dijkstra(int A , int[][] B , int src) {
        int[] ans = new int[A];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a , b) -> a.w - b.w);
        pq.add(new Pair(src, 0));
        List<Pair>[] adjList = getadj(B , A);
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (p.w > ans[p.Node]) continue;
            ans[p.Node ] =  p.w;
            for (Pair nbr : adjList[p.Node]) {
                int edge = nbr.w;
                int child = nbr.Node;
                int newDist = p.w + edge;
                if (newDist < ans[child]){
                    ans[child]  = newDist;
                    pq.add(new Pair(child , newDist));
                }
            }
        }
        ArrayList<Integer> dist = new ArrayList<>();
        for(int i = 0; i < A; i++) {
            if(ans[i] == Integer.MAX_VALUE) {
                dist.add(-1);
            } else {
                dist.add(ans[i]);
            }
        }
        return dist;
    }

    private static List<Pair>[] getadj(int[][] B , int A) {
        ArrayList<Pair>[] adjList = new ArrayList[A];
        for (int i = 0; i < A; i++) adjList[i] = new ArrayList<>();
        for (int i = 0; i < B.length; i++) {
            int source = B[i][0];
            int destination = B[i][1];
            int weight = B[i][2];
            adjList[source].add(new Pair(destination , weight));
            adjList[destination].add(new Pair(source , weight));
        }
        return adjList;
    }

}
