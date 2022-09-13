package mypackage;

interface Stack{
    void push(int x);
    int pop();
}

public class StackImplementation implements Stack{
    int top;
    int size;
    int[] stack;

    public StackImplementation() {
        top=-1;
        size=10;
        stack=new int[size];
    }
    @Override
    public void push(int x){
        if(top==size-1){
            System.out.println("Overflow");
        }
        stack[++top]=x;
        
    }
    @Override
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
        Stack st=new StackImplementation();
        st.push(34);
        st.push(78);
        st.push(45);
        int x=st.pop();
        System.out.println("Popped out element is " + x);
    }
}
