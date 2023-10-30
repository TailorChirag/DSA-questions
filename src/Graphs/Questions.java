package Graphs;

import java.util.ArrayList;
import java.util.*;

public class Questions {
    public static int DijAlgo(int[][] A, int B, int C) {
        int[] store = new int[C+1];
        Arrays.fill(store,Integer.MAX_VALUE);
        store[0]=0;
        store[B]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        ArrayList<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i<=C; i++) adj.add(new ArrayList<>());
        for(int i=0;i<A.length; i++){
            adj.get(A[i][0]).add(new int[]{A[i][1],A[i][2]});
        }
        pq.offer(new int[]{B,0});

        while(!pq.isEmpty()){
            int node = pq.peek()[0];
            int value = pq.peek()[1];
            pq.poll();

            for(int[] arr : adj.get(node)){
                int newN = arr[0];
                int newV = arr[1];
                if(value+newV<store[newN]){
                    store[newN] = value+newV;
                    pq.offer(new int[]{newN,store[newN]});
                }
            }
        }
        int min = Integer.MIN_VALUE;
        for(int i : store){
            min = Math.max(min,i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public static void dfs(int x, int y, int[][] A){
        // Island cnt 
        if(x<0 || x>=A.length || y<0 || y>=A[0].length ){
            return;
        }
        if(A[x][y] == 0 ){
            return ;
        }
        A[x][y] = 0;
        dfs(x-1,y,A);
        dfs(x,y-1,A);
        dfs(x+1,y,A);
        dfs(x,y+1,A);
        dfs(x-1,y-1,A);
        dfs(x+1,y+1,A);
        dfs(x-1,y+1,A);
        dfs(x+1,y-1,A);

    }
    static class Pair{
        int Node;
        int w;

        Pair(int Node,int w){
            this.Node = Node;
            this.w = w;
        }
    }
    public static ArrayList<Integer> dijkstra(int A,int[][] B,int src){
        int[] ans = new int[A];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        Set<Pair> s =new TreeSet<>(( a,b ) -> a.w - b.w);
        s.add(new Pair(src,0));
        List<Pair>[] adjList = getadj(B,A);
        while(!s.isEmpty()){
            Pair p = ((TreeSet<Pair>) s).pollFirst();
            int node = p.Node;
            int dis = p.w;
            for (Pair nbr: adjList[node]){
                int child = nbr.Node;
                int edge = nbr.w;
                int newdist = ans[node] + edge;
                if(newdist < ans[child]){
                    s.remove(p);
                    ans[child] = newdist;
                    s.add(new Pair(child,newdist));
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
    private static List<Pair>[] getadj(int[][] B, int A){
        ArrayList<Pair>[] adjList = new ArrayList[A];
        for(int i=0; i<A; i++) adjList[i] = new ArrayList<>();
        for(int i=0; i<B.length; i++){
            int source = B[i][0];
            int destination = B[i][1];
            int weight = B[i][2];
            adjList[source].add(new Pair(destination,weight));
            adjList[destination].add(new Pair(source,weight));
        }
        return adjList;

    }
    public static void main(String[] args) {
//        int A = 6;
//        int C = 4;
//        int[][] B = {{0, 4, 9},
//                {3 , 4 , 6},
//                {1 , 2 , 1},
//                {2 , 5 , 1},
//                {2 , 4 , 5},
//                {0 , 3 , 7},
//                {0 , 1 , 1},
//                {4 , 5 , 7},
//                {0 , 5 , 1}};
//        ArrayList<Integer> ans = dijkstra(A,B,C);
//        for (int i=0; i<ans.size(); i++) System.out.print(ans.get(i)+",");
        int[] A = {1,1,2};
        int B = 1;
        int C = 2;



        System.out.println(0);




    }
}
