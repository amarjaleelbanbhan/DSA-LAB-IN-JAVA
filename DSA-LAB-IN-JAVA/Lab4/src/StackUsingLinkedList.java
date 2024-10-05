public class StackUsingLinkedList {
    private Node head;
    private int size;

    public class Node {
        Object data;
        Node next;
        Node(Object data){
            this.data=data;
            this.next=null;
        }
    }

    public StackUsingLinkedList(){
        this.head=null;
        this.size=0;
    }

    public void push(Object data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
        System.out.println("Inserting "+ data);
    }

    public Object pop(){
        if(head==null){
            System.out.println("Stack Underflow");
            return -1;
        }

        Object poppedData=head.data;
        head=head.next;
        size--;
        System.out.println("Remove "+ poppedData);

        return poppedData;
    }

    public Object peek(){
        if(head==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }

    // Display stack elements
    public void display() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push("a");
        stack.push(1.5);
        stack.push(5);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("isEmpty "+stack.isEmpty());
    }

}
