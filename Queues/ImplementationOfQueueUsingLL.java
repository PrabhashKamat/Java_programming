package Queues;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int length;

    void add(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
        }
        else {
            tail.next = temp;

        }
        tail = temp;
        length++;
    }
    int remove() throws Exception{
        if(head==null){
            throw new Exception("Queue is empty! sorry");
        }
        else if(head==tail){
            int temp = head.val;
            head=tail=null;
            length--;
            return temp;
        }
        else{
            int temp=head.val;
            head=head.next;
            length--;
            return temp;
        }
    }
    int peek() throws Exception{
        if(head==null) {
            throw new Exception("Queue is empty! sorry");
        }
        return head.val;

    }
    int size(){
        return length;
    }
}
public class ImplementationOfQueueUsingLL{
    public static void main(String[] arg) throws Exception {
        MyQueue q = new MyQueue();
        q.add(3);
        q.add(6);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
