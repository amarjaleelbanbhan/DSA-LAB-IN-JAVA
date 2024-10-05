public class TaskIII implements List {
    class Node{
        Object data;
        Node next;
        public Node(Object o) {
            super();
            this.data = null;
            this.next = null;
        }

    }

    Node head;
    int size;
    public TaskIII() {
        head=new Node(null);
        size =0;
    }



    public boolean isEmpty() {
        return size==0;
    }
    public int size() {
        return size;
    }

    public void add(Object item) {
        if(head==null) {
            head= new Node(item);
            return;
        }
        Node temp =head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=new Node(item);
        size++;
    }



    @Override
    public void add(int index, Object item) {
        // TODO Auto-generated method stub
        if(index==1) {
            Node temp=new Node(item);
            temp.next=head;
            head=temp;
            return;
        }
        else {
            int i =2;
            Node temp = head;
            while(i < index) {
                temp=temp.next;
                i++;
            }

            Node n = new Node(item);
            n.next = temp.next;
            temp.next=n;
            size++;
        }
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        if(head==null)
            return ;
        if(index==1) {
            head=head.next;
            size--;
            return ;

        }
        else {
            int i = 2;
            Node temp=head;
            while(i<index) {
                temp = temp.next;
                i++;
            }
            temp.next=temp.next.next;
            size--;

        }
    }




    @Override
    public void remove(Object item) {
        // TODO Auto-generated method stub
        if(head==null) {
            return;
        }
        if(head.data.equals(item)) {
            head=head.next;
            size--;
            return;
        }
        else {
            Node temp=head;
            Node temp1 = head.next;
            while(temp1.next!=null) {
                if(temp1.data.equals(item)) {
                    size --;
                    temp.next = temp1.next;
                    return;
                }
                temp= temp.next;
                temp1=temp1.next;
            }
        }
    }



    @Override
    public List duplicate() {
        List res=new TaskIII();
        Node temp =head;
        while(temp!=null) {
            res.add(temp.data);
            temp=temp.next;
        }

        return res;
    }

    @Override
    public List duplicateReversed() {
        List res= new TaskIII();
        Node temp=head;
        while(temp!=null) {
            res.add(1,temp.data);
            temp = temp.next;
        }
        return res;
    }
    public String toString() {
        String  s= String.format("[ size: %d", size);
        Node temp=head;
        while(temp.next!=null) {
            s+=temp.data+",";
            temp=temp.next;
        }
        s+=temp.data+"]";
        return s;
    }
}
