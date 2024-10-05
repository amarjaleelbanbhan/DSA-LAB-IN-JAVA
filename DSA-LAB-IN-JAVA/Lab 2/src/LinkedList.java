public class LinkedList {
    Node head=null;
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null) {
            head=node;
            return;
        }
        Node n=head;
        head=node;
        node.next=n;
//                  node.next=head;
//                  head=node;


    }
    public void addMiddle(int index,int data) {
        if(index==0) {
            addFirst(data);
            return;
        }
        Node node =new Node(data);
        Node temp=head;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    void addLast(int data){
        Node node=new Node(data);
        node.data=data;
        node.next=null;
        if(head==null)
            head=node;
        else{
            Node n=head;
            while(n.next!=null)
                n=n.next;
            n.next=node;
        }
    }
    public void show(){
        if(head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // Task I
    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                System.out.println(target+"found");
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.show();
        int target = 4;
        if (ll.search(target)) {
            System.out.println(target + " found in the linked list.");
        } else {
            System.out.println(target + " not found in the linked list.");
        }
    }

}

