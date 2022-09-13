package mypackage;

public class StackImplementation {
    int top;
    int size;
    int[] stack;

    public StackImplementation() {
        top=-1;
        size=10;
        stack=new int[size];
    }
    public void push(int x){
        if(top==size-1){
            System.out.println("Overflow");
        }
        stack[++top]=x;
        
    }
    public int pop(){
        if (top==-1) {
            System.out.println("Underflow");
        }
        return stack[top--];
        
    }
    public int peek(){
        return stack[top];
    }
    public static void main(String[] args) {
        StackImplementation st=new StackImplementation();
        st.push(34);
        st.push(78);
        st.push(45);
        int x=st.pop();
        System.out.println("Popped out element is " + x);
        System.out.println("The top element is " + st.peek());
    }
}
