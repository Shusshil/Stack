package Stack;

public class Array {
	public static void main(String[] args) {
		StackA st = new StackA(5);
        System.out.println(st.isEmpty());
        st.push(8);
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(7);
        System.out.println("size = " + st.size() + " top element = " + st.top());
        st.push(5);
        st.pop();
        System.out.println("size = " + st.size() + " top element = " + st.top());
        st.pop();
        System.out.println("size = " + st.size() + " top element = " + st.top());
        st.pop();
        System.out.println(st.isEmpty());
        st.pop(); 
	}
}
class StackA{
    private int top;
    private int arr[];
    private int maxsize;
    
    StackA(int size){
        this.maxsize = size;
        arr = new int[size];
        top = -1;
    }
    public void push(int value){
        if((top + 1) == maxsize){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = value;
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    public boolean isEmpty(){
        if(top == -1)
        return true;
        else
        return false;
    }
    public int size(){
        return top+1;
    }
    public int top(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
}