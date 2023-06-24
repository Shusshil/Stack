package Stack;

public class Linked_List {
	public static void main(String[] args) {
		StackB st = new StackB();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(10);
        st.push(8);
        st.push(3);
        System.out.println("top = " + st.top());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.pop();
        st.pop();
        System.out.println("top = " + st.top());
        System.out.println(st.size());
	}
}
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        next = null;
    }
}
class StackB{
    Node top;
    int size;
    
    StackB(){
        size = 0;
    }
    
    public void push(int data){
        Node newNode = new Node(data);
        size++;
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }
    public void pop(){
        if(top == null){
            System.out.print("Stack Underflow");
            return;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        size--;
    }
    public boolean isEmpty(){
        if(top == null)
        return true;
        else
        return false;
    }
    public int size(){
        return size;
    }
    public int top(){
        if(top == null){
            System.out.print("Stack Underflow");
            return -1;
        }
        return top.data;
    }
}
