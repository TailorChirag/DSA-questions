package practise;

import java.util.*;

public class pra {
    public static int solve(int[] A,int B){
//        int [] A = {2, 5, -1, 7, -3, -1, -2};
//        int B = 4;
        int n = A.length;
        Deque<Integer> min = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        int mod = 1000000007;
        long ans = 0;
        for(int i=0; i<B; i++){
            while(!min.isEmpty() && min.peekLast()>A[i]){
                min.pollLast();
            }
            min.offerLast(A[i]);
            while(!max.isEmpty() && max.peekLast()<A[i]){
                max.pollLast();
            }
            max.offerLast(A[i]);
        }
        ans += (long)(min.peekFirst()+max.peekFirst())%mod;
        int s = 1;
        int e = B;
        while(e<n){
            if(A[s-1] == min.peekFirst()){
                min.pollFirst();
            }
            if(A[s-1] == max.peekFirst()){
                max.pollFirst();
            }
            while(!min.isEmpty() && min.peekLast()>A[e]){
                min.pollLast();
            }
            min.addLast(A[e]);
            while(!max.isEmpty() && max.peekLast()<A[e]){
                max.pollLast();
            }
            max.addLast(A[e]);
            ans += ((min.peekFirst()%mod)+(max.peekFirst()%mod))%mod;
            s++; e++;
        }
        ans = (ans+mod)%mod;
        return (int)ans;
    }
    public static boolean isOp(char x){
        if(x=='+' || x=='-' || x=='*' || x=='/' ) return true;
        return false;
    }
    public static int braces(String A){
        Stack<Character> s = new Stack<>();
        for(char x : A.toCharArray()){
            if(isOp(x) || x=='(') s.push(x);
            else if(x==')') {
                if(s.peek().equals('(')) return 1;
                else{
                    s.pop();
                    s.pop();
                }
            }
        }
        return 0;
    }
    public static int gcd(int f,int s){
        for(int i=Math.min(f,s);i>0;i--){
            if(f%i==0 && s%i==0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = {12, 15, 18};
        int n = A.length;
        int [] pf = new int[n];
        int [] sf = new int[n];
        pf[0] = A[0];
        sf[n-1] = A[n-1];
        for(int i=1; i<n; i++){
            pf[i] = gcd(pf[i-1],A[i]);
        }

        for(int i=n-2; i>=0; i--){
            sf[i] = gcd(sf[i+1],A[i]);
        }
        int max = sf[1];
        for( int i=1; i<n-1; i++){
            int left = pf[i-1];
            int right = sf[i+1];
            max = Math.max(gcd(left,right),max);
        }
        max = Math.max(max,pf[n-1]);
        System.out.println(max);




    }
}
