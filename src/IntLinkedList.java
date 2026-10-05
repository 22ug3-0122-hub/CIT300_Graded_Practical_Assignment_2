public class IntLinkedList {
    private Node head; private int size;
    private static class Node{int data; Node next; Node(int d){data=d;}}
    public String insertAtBeginning(int value){Node n=new Node(value); n.next=head; head=n; size++; return "Value inserted at beginning.";}
    public String insertAtEnd(int value){Node n=new Node(value); if(head==null)head=n; else{Node c=head; while(c.next!=null)c=c.next; c.next=n;} size++; return "Value inserted at end.";}
    public String delete(int value){if(head==null)return "Linked list is empty."; if(head.data==value){head=head.next;size--;return "Value deleted successfully.";} Node c=head; while(c.next!=null){if(c.next.data==value){c.next=c.next.next;size--;return "Value deleted successfully.";} c=c.next;} return "Value not found.";}
    public int search(int value){Node c=head; int p=0; while(c!=null){if(c.data==value)return p;c=c.next;p++;}return -1;}
    public void display(){if(head==null){System.out.println("Linked list is empty.");return;} System.out.print("Linked List: "); Node c=head; while(c!=null){System.out.print(c.data+(c.next!=null?" -> ":""));c=c.next;}System.out.println();}
}
