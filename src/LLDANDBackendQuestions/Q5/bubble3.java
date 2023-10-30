package LLDANDBackendQuestions.Q5;

import java.util.Scanner;

public class bubble3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String[] array = new String[input];
        for(int i = 0; i<input; i++){
            array[i] = sc.next();
        }
        int size = array.length;
        for(int times = 1; times<size; times++){
            for(int i=0; i<size-times; i++){
                if(array[i].compareTo(array[i+1])>0){
                    swap(array,i,i+1);
                }
            }
        }
        for(int i=0; i<size; i++)
        {
            System.out.println(array[i]);
        }
    }
    static void swap(String[] array,int i,int j ){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

