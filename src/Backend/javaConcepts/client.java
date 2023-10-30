package Backend.javaConcepts;

import java.util.*;

public class client {
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Set<Point> hs = new HashSet<>();
        hs.add(p1);
        Point p2 = new Point(10,20);
        hs.add(p2);


        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(hs);

    }
}
