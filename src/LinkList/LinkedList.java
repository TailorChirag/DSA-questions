package LinkList;

public class LinkedList {
//    data Members
    Node head;
    Node tail;
    int size;
//    Methods
    LinkedList(){
        head=tail=null;
        size=0;
    }
    public void addFirst(int d){
        Node n=new Node(d);
        n.next=head;
        head=n;
        if(size==0){
            tail=n;
        }
        size++;
    }
    public void addlast(int d){
        Node n=new Node(d);
        if(size==0){
            head=tail=n;
        }
        else {
            tail.next =n;
            tail = n;
        }
        size++;
    }
    public void addAtPosition(int d,int idx) throws Exception{
        if(idx<0 || idx>size){
            throw new Exception("Index out of bounds");
        }
        if(idx==0){
            addFirst(d);
        }
        else if(idx==size){
            addlast(d);
        }
        else{
            Node temp=head;
            for(int jump=1; jump<=idx-1; jump++){
                temp=temp.next;
            }
            Node n=new Node(d);
            n.next=temp.next;
            temp.next=n;
            size++;
        }
    }
    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }

    public int getAtPos(int idx){
        if(idx==0){
            return getFirst();
        }
        else if(idx==size){
            return getLast();
        }
        else{
            Node temp=head;
            for(int jumps=1; jumps<=idx; jumps++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public Node midNode(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // INTERVIEW PROBLEM
    public void reverse(){
        Node prev = null;
        Node current = head;
        tail = head;

        while(current!=null){
            Node temp=current.next;
            current.next=prev;
            // Update prev and current
            prev = current;
            current = temp;
        }
        head = prev;

    }

    public void removeFirst()throws Exception{
        if(size==0){
            throw  new Exception("cant remove from empty Linked list");
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            head=head.next;
            size--;
        }
    }
    public void removelast() throws Exception{
        if(size==0){
            throw  new Exception("cant remove from empty Linked list");
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
    }
    public void removeAtPos(int idx) throws Exception{

        if(size==0){
            throw new Exception("Empty Linked List");
        }
        if(idx<0 || idx>size){
            throw new Exception("Index out of bounds");
        }
        if(idx==0){
            removeFirst();
        }
        else if(idx==size){
            removelast();
        }
        else{
            Node temp=head;
            for(int jumps=1; jumps<idx; jumps++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }


    }
    public boolean contains(int key){
        Node temp=head;
        for(int i=0; i<size; i++){
            if( temp.data== key)return true;
            temp=temp.next;
        }
        return false;
    }

}
