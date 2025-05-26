import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int solve(String A, int B) {

        Map<Character, Integer> map = new HashMap<>();

        int i = -1;
        int j = -1;
        int ans = -1;
        while(true){

            boolean f1 = false;
            boolean f2 = false;

            while(i < A.length()-1) {
                f1 = true;
                i++;
                char ch = A.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);

                if(map.size() < B)
                    continue;
                else if(map.size() == B ){
                    int len = i-j;
                    ans = Math.max(len, ans);
                }
                else
                    break;
            }
            while(j < i){
                f2 = true;
                j++;

                char ch = A.charAt(j);

                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);
                }

                if(map.size() == B){
                    int len = i - j;
                    ans = Math.max(ans,len);
                    break;
                }
                else if(map.size() > B) continue;
            }
            if(f1 == false && f2 == false)  break;
        }
        return ans;
    }
    public static void main(String[] args) {

        String s = "aaaccb";
        int k = 5;

        // Function Call
        int ans = solve(s, k);
        System.out.println(ans);
        System.out.println("Hello world!");
    }
}