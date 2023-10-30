package DynamicPrograming;
import java.util.*;
import java.lang.*;
public class Questions {
    public static  void fibonacci(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ENTER THE NUMBER :  " + n );
//        int[] dp = new int[n+1];
//        Arrays.fill(dp,-1);
        int a = 0;
        int b = 1;
        int ans = 0;
        if(n==1) System.out.println(1);
        else {
            for (int i = 2; i <= n; i++) {
                ans = b + a;
                a = b;
                b = ans;
            }
            System.out.println(ans);
        }
    }
    public static void KnapSack(){
        // KnapSack 0-1 DP
        int[] A = {100,80,40,90};
        int[] B = {12,3,6,15};
        int C = 20;
        int n = A.length;
        int[][] dp = new int[n+1][C+1];

        for(int i=0; i<n; i++){
            dp[i][0] = 0;
        }
        for(int i=0; i<=C; i++){
            dp[0][i] = 0;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=C; j++){
                int price = A[i-1];
                int wt = B[i-1];
                int check = 0;
                if(j >= wt){
                    check = price+dp[i][j-wt];
                }
                dp[i][j] = Math.max(check,dp[i-1][j]);
            }
        }
        for(int i=0; i< dp.length; i++){
            System.out.print("[");
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]);
                if(j!=dp[0].length-1)
                    System.out.print(",");
            }
            System.out.println("]");
        }
    }
    public static void longestPalindromicSubsequence(){
        String A ="bebeeed";
        StringBuilder ch = new StringBuilder();
        ch.append(A);
        ch.reverse();
        String B = ch.toString();
        int n = A.length();
        int[][] dp = new int[n+1][n+1];
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                if (A.charAt(i - 1) == B.charAt(j- 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        System.out.println(dp[n][n]);
    }
    public static int EditDistance(String s1,String s2,int n,int m,int[][] dp ){
        if(n==s1.length()) return s2.length()-m;
        if(m==s2.length()) return s1.length()-n;
        int ans = Integer.MAX_VALUE;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n) == s2.charAt(m)){
            ans = EditDistance(s1,s2,n+1,m+1,dp);
        }
        else {
            ans =Math.min(ans,1 + EditDistance(s1, s2, n +1, m +1,dp));
            ans =Math.min(ans,1 + EditDistance(s1, s2, n, m +1,dp));
            ans =Math.min(ans,1 + EditDistance(s1, s2, n + 1, m,dp));
        }
        return dp[n][m]=ans;
    }
    public static int[][] minDis(String s1,String s2){
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0; i<=s1.length(); i++ ) dp[i][0] = i;
        for(int j=0; j<=s2.length(); j++ ) dp[0][j] = j;
        for(int i=0; i<=s1.length(); i++){
            for(int j=0; j<=s2.length(); j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                } else if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] ;
                }else {
                    dp[i][j] = Math.min(Math.min
                            (dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp;

    }
    public static void patt(){
        String A = "baaa";
        String B = "ba*";
        int n = A.length();
        int m = B.length();
        boolean [][] dp = new boolean[2][m];
        for(int i=0; i<m; i++){
            if(B.charAt(i)== ' '){
                dp[0][i] = i<1 || dp[0][i-1];
            }
            else {
                dp[0][i] = false;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(B.charAt(j-1)==A.charAt(i-1)){
                    dp[i-1][j-1] = true;
                } else if (B.charAt(j-1)=='*') {

                }
            }
        }

    }
    public static int check(int n,int m,int len,String A,String B,String C,int[][] dp){
        if(n<0 && m<0 && len<0) return 1;
        if(n<0){
            if(B.charAt(m)==C.charAt(len)){
                return check(n,m-1,len-1,A,B,C,dp);
            }else return 0;
        }
        if(m<0){
            if(A.charAt(n)==C.charAt(len)){
                return check(n-1,m,len-1,A,B,C,dp);
            }else return 0;
        }
        if(dp[n][m]!=-1) return dp[n][m];
        if(A.charAt(n)==C.charAt(len) && B.charAt(m)==C.charAt(len)){
            dp[n][m] = check(n-1,m,len-1,A,B,C,dp) |
                    check(n,m-1,len-1,A,B,C,dp);
        } else if(A.charAt(n)==C.charAt(len)){
            dp[n][m] = check(n-1,m,len-1,A,B,C,dp);
        } else if (B.charAt(m)==C.charAt(len)) {
            dp[n][m] = check(n,m-1,len-1,A,B,C,dp);
        }else {
            dp[n][m] = 0 ;
        }
        return dp[n][m];

    }
    public static int patt(String txt, String pattern, int i,int j,int[][] dp){
        if(i == -1 && j == -1) return 1;
        if(j==-1 ) return 0;
        if(i == -1 ){
            for(int k =0; k<=j; k++){
                if(pattern.charAt(k)!='*')
                    return 0;
            }
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int ans = -1;
        if ( pattern.charAt(j) == txt.charAt(i)|| pattern.charAt(j) == '?'){
            ans = patt(txt,pattern,i-1,j-1,dp);
        } else if(pattern.charAt(j) == '*')  {
            ans = patt(txt,pattern,i-1,j,dp)
                    | patt(txt,pattern,i,j-1,dp);
        }else {
            ans = 0;
        }
        return dp[i][j] = ans;
    }
    public static void main(String[] args) {
//        String A = "abad";
//        String B = "abac";
//        int n = A.length();
//        int m = B.length();
//        int[][] dp = minDis(A,B);
//        System.out.print(dp[n-1][m-1]);

//        String A = "aaa";
//        String B = "a**";
//        int[][] dp = new int[A.length()][B.length()];
//        for(int [] arr: dp) Arrays.fill(arr,-1);
//        System.out.println(patt(A,B,A.length()-1,B.length()-1,dp));

        int[] arr = {1,3,0,2,6,4,8,10,5};
        int[] dp = new int[arr.length];
        int ans = 0;
        for(int i=0; i< arr.length; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(arr[i] > arr[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
            ans = Math.max(ans,dp[i]);
        }
        System.out.println(
                ans);
        







    }
}
