public class IntStack {
    private final int[] data; private int top=-1;
    public IntStack(int capacity){data=new int[capacity];}
    public String push(int value){if(top==data.length-1)return "Stack overflow. Stack is full."; data[++top]=value; return "Value pushed successfully.";}
    public String pop(){if(top==-1)return "Stack underflow. Stack is empty."; return "Popped value: "+data[top--];}
    public String peek(){return top==-1?"Stack is empty.":"Top value: "+data[top];}
    public void display(){if(top==-1){System.out.println("Stack is empty.");return;} System.out.print("Stack (top to bottom): "); for(int i=top;i>=0;i--)System.out.print(data[i]+(i>0?"  ":"")); System.out.println();}
}
