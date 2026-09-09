package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    Node tail;
    int len;

    int peek() throws Exception{ // deleteAtHead
        if(head==null){
            throw new Exception("Stack UnderFlow error");
        }
        return head.val;
    }

    int pop() throws Exception{ // DisplayHead
        if(head==null){
            throw new Exception("Stack UnderFlow error");
        }

        int x = head.val;
        head=head.next;
        len--;
        return x;
    }
    void push(int value){ // addAtHead
        Node temp = new Node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }
    void display() throws Exception{
        if(head==null){
            throw new Exception("Stack UnderFlow error");
        }
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    int size(){
        return len;
    }
}
public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack(); // Stack creation
        st.push(9);
        st.push(18);
//        System.out.println(st.pop());
        st.display();
    }
}
