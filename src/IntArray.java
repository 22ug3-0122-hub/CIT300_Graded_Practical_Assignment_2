public class IntArray {
    private final int[] data; private int size;
    public IntArray(int capacity){data=new int[capacity];}
    public String insert(int index,int value){if(size==data.length)return "Array is full. Cannot insert."; if(index<0||index>size)return "Invalid index."; for(int i=size;i>index;i--)data[i]=data[i-1]; data[index]=value; size++; return "Value inserted successfully.";}
    public String delete(int index){if(size==0)return "Array is empty. Cannot delete."; if(index<0||index>=size)return "Invalid index."; for(int i=index;i<size-1;i++)data[i]=data[i+1]; size--; return "Value deleted successfully.";}
    public int search(int value){for(int i=0;i<size;i++)if(data[i]==value)return i; return -1;}
    public void display(){if(size==0){System.out.println("Array is empty.");return;} System.out.print("Array: "); for(int i=0;i<size;i++){System.out.print(data[i]+(i<size-1?"  ":""));} System.out.println();}
    public int size(){return size;} public int[] toArray(){int[] c=new int[size]; System.arraycopy(data,0,c,0,size); return c;}
}
