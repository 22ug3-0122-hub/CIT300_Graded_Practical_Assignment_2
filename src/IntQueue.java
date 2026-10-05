public class IntQueue {
    private final int[] data; private int front=0,rear=-1,size=0;
    public IntQueue(int capacity){data=new int[capacity];}
    public String enqueue(int value){if(size==data.length)return "Queue is full. Cannot enqueue."; rear=(rear+1)%data.length; data[rear]=value; size++; return "Value enqueued successfully.";}
    public String dequeue(){if(size==0)return "Queue is empty. Cannot dequeue."; int v=data[front]; front=(front+1)%data.length; size--; return "Dequeued value: "+v;}
    public String peek(){return size==0?"Queue is empty.":"Front value: "+data[front];}
    public void display(){if(size==0){System.out.println("Queue is empty.");return;} System.out.print("Queue (front to rear): "); for(int i=0;i<size;i++){int x=(front+i)%data.length; System.out.print(data[x]+(i<size-1?"  ":""));} System.out.println();}
}
