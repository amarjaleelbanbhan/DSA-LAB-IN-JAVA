public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    StackUsingArray(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    }

    //insert element in stack
    public void push(int data){
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
       // System.out.println("Inserting " + data);
    }

    //out top element of stack
    public int  pop(){

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = stack[top--];
        //System.out.println("Removing " + poppedData);
        return poppedData;
    }

    //display top element of the stack
    public  int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    //size of stack
    public int size(){
        return top+1;
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
