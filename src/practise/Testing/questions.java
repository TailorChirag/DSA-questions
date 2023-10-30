package practise.Testing;
import java.util.*;
import java.lang.*;

public class questions {
    static int bar(int x, int y){
        if(y==0)
            return 0;
        return (x + bar(x,y-1));
    }
    static int foo(int x,int y){
        if(y==0)
            return 1;
        else if (y % 2 == 0) {
            return foo(x * x , y/2);
        }
        else{
            return x * foo(x *x , (y-1)/2);
        }
    }

    public static void main(String[] args) {

        System.out.println(foo(2,10));
        /*
        String A[]={"53..7...",
                "6..195...",
                ".98....6.",
                "8...6...3",
                "4..8.3..1",
                "7...2...6",
                ".6....28.",
                "...419..5",
                "....8..79"
        };
        HashSet<String> row = new HashSet<>();
        HashSet<String> col = new HashSet<>();
        HashSet<String> box  =new HashSet<>();

        for(int i=0; i<A.length; i++) {
            String str = A[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '.') {
                    if (row.contains(i + "-" + str.charAt(j)))
                        System.out.println(i + "-" + str.charAt(j));;
                    row.add(i + "-" + str.charAt(j));

                    if (col.contains(j + "-" + str.charAt(j)))
                        System.out.println(j + "-" + str.charAt(j));;

                    col.add(j + "-" + str.charAt(j));

                    String o = i / 3 + "-" + j / 3 + "-" + str.charAt(j);
                    System.out.println(o);
                    if (box.contains(o))
                        System.out.println(o);
                    box.add(o);
                }
            }
        }

         */
    }
}
