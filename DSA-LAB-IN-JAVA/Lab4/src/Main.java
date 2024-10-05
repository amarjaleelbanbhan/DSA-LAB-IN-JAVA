public class Main {
    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.push(3);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());
        stack.pop();
        System.out.println("Stack is empty: " + stack.isEmpty());

    }
}