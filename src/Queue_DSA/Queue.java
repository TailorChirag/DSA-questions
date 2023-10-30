package Queue_DSA;

public class Queue {

    protected int[] arr;
    protected int size;
    protected int front;
    public static final int DEFAULT_CAPACITY = 10;

    public Queue() throws Exception{
        this(DEFAULT_CAPACITY);
    }
    public Queue(int capacity) throws Exception{
        if(capacity<1){
            throw new Exception("Invalid capacity");
        }
        this.arr = new int[capacity];
        this.size = 0;
        this.front = 0;
    }
    //0(1)
    public void enqueue(int value) throws Exception{
        // Queue if full
        if(this.size == this.arr.length){
            throw new Exception("Queue is full");
        }
        int rear = (this.front + this.size)%this.arr.length;
        this.arr[rear] = value;
        this.size++;
    }
    public int dequeue() throws Exception{
        // Queue if full
        if(this.size == 0){
            throw new Exception("Queue is Empty");
        }
        int ans = this.arr[this.front];
        this.front = (this.front + 1)%this.arr.length;
        this.size--;
        return ans;
    }

    public int peek() throws Exception{
        if(this.size == 0){
            throw new Exception("Queue is Empty");
        }
        return this.arr[this.front];
    }

    public boolean empty() { return this.size==0; }
    public boolean full() { return this.size==this.arr.length; }
    public int size() { return this.size;  }

    //Print the queue
    public void display(){
        int idx = (this.front + 0)%this.arr.length;
        System.out.print(this.arr[idx]);

        for(int i=1; i<this.size; i++){
            idx = (this.front + i)%this.arr.length;
            System.out.print(","+this.arr[idx]);
        }
        System.out.println();
    }

}
