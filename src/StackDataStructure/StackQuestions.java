package StackDataStructure;
import java.lang.*;
import java.util.*;

public class StackQuestions {
    public static int precedence(char ch){
        if(ch == '^')
            return 3;
        else if(ch == '/' || ch == '*')
            return 2;
        else if(ch == '+' || ch == '-')
            return 1;
        return 0;
    }
    public static void main(String[] args) {

        int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int B = 3;
        int[] ans = new int[A.length-B+1];
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i<B; i++){
            while (!dq.isEmpty() && A[i]>A[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        int j = 0 ;
        ans[j++] = A[dq.peekFirst()];
        for(int i = B; i<A.length; i++ ){
            while(!dq.isEmpty() && dq.peekFirst()<=i-B){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && A[i]>A[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            ans[j++] = A[dq.peekFirst()];
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]);
        }
        System.out.println();



        /*
        // LARGEST RECTANGLE IN HISTOGRAM
        int [] A = {2, 1, 5, 6, 2, 3};
        int [] p1 = new int[A.length];
        int [] p2 = new int[A.length];
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for(int i=0; i<A.length; i++){
            while(!s1.empty() && A[s1.peek()]>=A[i]){
                s1.pop();
            }
            if(s1.empty())p1[i]=-1;
            else p1[i] = s1.peek();
            s1.push(i);
        }
        for(int i = A.length-1; i>=0; i--){
            while(!s2.empty() && A[s2.peek()]>=A[i]){
                s2.pop();
            }
            if(s2.empty())p2[i] = A.length;
            else p2[i] = s2.peek();
            s2.push(i);
        }
        int ans = 0;
        for(int i=0; i<A.length; i++){
            int area = (p2[i]-p1[i]-1)*A[i];
            ans = Math.max(ans,area);
        }
        System.out.println(ans);
        */

        /*
// PREFECT NUMBER USING QUEUE
        int A = 4;
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        while(A>1){
            System.out.println(q.peek());
            String n = q.poll();
            q.add(n + "1");
            q.add(n + "2");
            A--;
        }
        String ans = q.peek();
        StringBuilder back = new StringBuilder(ans);
        System.out.println(ans + back.reverse().toString());

         */
        /*

        String A = "x^t/(a*z)+b";
        Stack<Character> s = new Stack<>();
        char[] ch = A.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='^' ||
                ch[i]=='/' ||
                ch[i]=='*' ||
                ch[i]=='+' ||
                ch[i]=='-' ||
                ch[i]=='(' ||
                ch[i]==')'){
                if(ch[i]=='('){
                    s.push('(');
                }
                else if (ch[i]==')') {
                    while(s.peek()!='('){
                        sb.append(s.pop());
                    }
                    s.pop();
                }
                else if (s.isEmpty()) {
                    s.push(ch[i]);
                }
                else{
                    while(s.size()>0 && s.peek()!='('
                            && precedence(s.peek())>=precedence(ch[i])){
                        sb.append(s.pop());
                    }
                    s.push(ch[i]);
                }
            }
            else{
                sb.append(ch[i]);
            }
        }
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.println(sb.toString());

         */

        /*
        int [] arr = {2,5,10,7,11,4,1,12,30};
        int [] output = new int[arr.length];

        Stack<Integer> s =new Stack<>();
        for(int i=0; i< arr.length; i++){
            while (!s.empty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.empty()){
                output[i] = -1;
            }
            else{
                output[i] = s.peek();
            }
            s.push(arr[i]);
        }
        System.out.print(output[0]);
        for(int i=1; i< output.length; i++){
            System.out.print(","+output[i]);

        }

         */


        /*

        // STOCK SPAN PROBLEM
        int[] Stock = {100,80,60,70,60,75,85};
        int[] span = new int[7];
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<Stock.length; i++){
            while(!s.empty() && Stock[i]>=Stock[s.peek()]){
                s.pop();
            }
            if(s.empty()) {
                span[i] = i + 1;
            } else {
                span[i] = i-s.peek();
            }
            s.push(i);
        }
        for (int i=0; i<span.length; i++){
            System.out.print(span[i]+",");
        }
        System.out.println();

         */
    }
}
