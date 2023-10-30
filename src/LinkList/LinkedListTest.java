package LinkList;

import java.sql.SQLOutput;

public class LinkedListTest {
    public static Node rev(Node temp){
        Node current=temp;
        Node prev=null;
        while (current!=null){
            Node t=current.next;
            current.next=prev;
            prev=current;
            current=t;
        }
        return prev;
    }
    public static Node midNode(Node A){
        Node slow = A;
        Node fast = A;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        Node temp=slow.next;
        slow.next=null;
        temp=rev(temp);
        return merge(A,temp);
    }
    public static Node merge1(Node A,Node B){
        Node head=null,current=null;
        while(A!=null && B!=null){
            Node temp1=A;
            A = A.next;
            Node temp2 = B;
            B = B.next;
            if(head==null){
                head=temp1;
                temp1.next=temp2;
                current=temp2;
            }
            else{
                current.next=temp1;
                temp1.next=temp2;
                current = temp2;
            }
        }
        if(A!=null)current.next=A;
        if(B!=null)current.next=B;
        return head;
    }
    public static Node merge(Node A, Node B){
        Node head;
        Node t1;
        Node t2;
        head=t1=A;
        t2=B;
        while (A!=null && B!=null ) {
            t1 = t1.next;
            A.next = B;
            t2 = t2.next;
            B.next = t1;
            A = t1;
            B = t2;
        }
        return head;
    }
    public static void main(String[] args) throws Exception{
        LinkedList l=new LinkedList();
        l.addlast(6);
        l.addFirst(5);
//        l.addFirst(4);
//        l.addFirst(3);
//        l.addFirst(2);
//        l.addFirst(1);
//        l.addlast(7);
//        l.addlast(8);
        l.display();
        Node A = l.head;
        Node ans =midNode(A);
        while (ans!=null){
            System.out.print(ans.data+"->");
            ans=ans.next;
        }
        System.out.println();



//        System.out.println(l.midNode().data);





        /*
        l.addAtPosition(8,3);
        l.addAtPosition(0,0);
        l.reverse();
        l.display();

        l.display();
        l.removeFirst();
        l.removelast();
        l.removeAtPos(4);
        l.display();
        if(l.contains(-5)==true){
            System.out.println("it is present");
        }
        else{
            System.out.println("not present");
        }
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getAtPos(3));
        l.display();

         */

        /*        Node a=new Node(5);
        Node b=new Node(6);
        a.next=b;
        System.out.println(a.data);
        System.out.println(a.next.data);
        */

    }
}
