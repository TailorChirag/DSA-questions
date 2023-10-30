package Backend.javaConcepts.ExceptionHandlinh;

import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a / b;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println(e + " DivideByZero");
        }
    }
}
