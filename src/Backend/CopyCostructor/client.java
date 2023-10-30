package Backend.CopyCostructor;

import java.util.LinkedList;
import java.util.Queue;

public class client {
    public static void main(String[] args) {
        Student s1 = new Student(21,"Chirag");
//        s1.age = 22;
//        s1.name = "Chirag";
        s1.getAge();
        Student s2 = new Student(s1);
        s2.getAge();
        Queue<Integer> q = new LinkedList<>();
    }
}
