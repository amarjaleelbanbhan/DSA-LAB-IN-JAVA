import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;
    private int size;

    // Constructor
    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        size = 0;
    }

    // Push method - Push element to the stack
    public void push(T data) {
        // Always add element to queue2
        queue2.add(data);
        size++;

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        // Swap the names of queue1 and queue2
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop method - Remove and return the top element of the stack
    public T pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        size--;
        return queue1.remove();
    }

    // Peek method - Return the top element without removing it
    public T peek() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    // isEmpty method - Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // Size method - Return the current size of the stack
    public int size() {
        return size;
    }

    // Main method to test the Stack implementation
    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());  // Output: 3
        System.out.println("Popped: " + stack.pop());        // Output: 3
        System.out.println("Popped: " + stack.pop());        // Output: 2

        stack.push(4);
        System.out.println("Top element: " + stack.peek());  // Output: 4
        System.out.println("Popped: " + stack.pop());        // Output: 4
        System.out.println("Popped: " + stack.pop());        // Output: 1

        System.out.println("Stack is empty: " + stack.isEmpty()); // Output: true
    }
}
