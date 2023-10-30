package TreeDataStructure;
import java.util.*;
import java.lang.*;

public class TreeBuilding {
    public static int Distance(Node A,int key){
        if(A==null)return -1;
        else{
            if(A.data == key) return 0;
            int l = Distance(A.left,key);
            System.out.println("bl = "+ l);
            int r = Distance(A.right,key);
            System.out.println("rl = "+ r);

            if(l>=0) return l+1;
            System.out.println("al = " + l);
            if(r>=0) return r+1;
            System.out.println("al = "+ r);
        }
        return -1;
    }
    public static Node lca(Node A,int key,int C){
        if(A==null)return A;
        if(A.data == key || A.data == C) return A;
        Node left = lca(A.left,key,C);
        Node right = lca(A.right,key,C);
        if(left==null) return right;
        else if(right==null) return left;
        return A;
    }
    public static int solve(Node A, int B, int C) {
        Node lca = lca(A,B,C);
        if(lca.data==B) return Distance(lca,C);
        else if(lca.data == C) return Distance(lca,B);
        return Distance(lca,B) + Distance(lca,C);

    }
    public static Node createBst(int arr[], int s, int e ){
        if(s>e) {
            return null;
        }
        int mid= (s+e)/2;
        Node root =new Node(arr[mid]);

        root.left = createBst(arr, s,mid-1);
        root.right = createBst(arr,mid+1,e);
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,8,6,11};
        int S = arr[0];
        int e = arr.length-1;

        Node A = createBst(arr,S,e);
        int a = solve(A,2,11);
        System.out.println("ans = " + a);


//        ArrayList<Integer> ans=new ArrayList<>();
//        Stack<Node> s = new Stack<>();
//        Node curr = A;
//        while(!s.empty() || curr!=null){
//            if(curr!=null){
//                s.push(curr);
//                curr = curr.left;
//            }
//            else{
//                curr = s.pop();
//                ans.add(curr.data);
//                curr = curr.right;
//            }
//        }
//        for(int i=0; i<ans.size(); i++){
//            System.out.println(ans.get(i));
//        }
//        System.out.println();




    }
}
