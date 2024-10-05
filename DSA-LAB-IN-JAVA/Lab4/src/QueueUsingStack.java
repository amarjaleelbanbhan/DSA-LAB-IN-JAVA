public class QueueUsingStack {
    private StackUsingArray s1,s2;

    QueueUsingStack(int size){
        s1=new StackUsingArray(size);
        s2=new StackUsingArray(size);
    }

    public void enqueue(int data){
        if(s1.isFull())
            throw new IllegalStateException("Stack is full");
        s1.push(data);

    }
    public int dequeue(){
        if(s2.isEmpty()){
            if(s1.isEmpty()){
                throw new IllegalStateException("Queue is Empty");
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        int[] keys={1,2,3,4,5};
        QueueUsingStack q=new QueueUsingStack(5);
        for(int key : keys){
            q.enqueue(key);
        }

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }

}
