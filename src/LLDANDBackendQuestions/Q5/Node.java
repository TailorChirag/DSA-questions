package LLDANDBackendQuestions.Q5;



import java.util.Iterator;

public class Node implements Iterable<Node>{
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
    class NodeIterator implements Iterator<Node>{
        Node head;
        public NodeIterator(Node head){
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            return this.head != null;
        }
        public Node next(){
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
}
