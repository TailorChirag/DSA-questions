package StackDataStructure;

public class StackDemo {
    public static void main(String[] args) throws Exception {
        StackArray s = new StackArray(50);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
//        s.display();

        while (!s.empty()){
            int top = s.peek();
            System.out.println(top);
            s.pop();
        }
    }

}
