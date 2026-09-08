package LikedList;

class ListNode{ // user defined data type
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}

class DLL{
    ListNode head;
    ListNode tail;
    int size;
    DLL(){

    }

    void addAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head ==null){
            head=tail=temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head=temp;
        }
        size++;
    }

    void addAtTail(int val){
        ListNode temp = new ListNode(val);
        if(tail==null){
            head=tail=temp;
        }
        else{
            tail.next = temp;
            temp.prev=tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head==null) System.out.println("Linked List is empty! sorry");
        else if(head==tail){
            head=head.next;
            tail=tail.next;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }

    void deleteAtTail(){
        if(tail==null) System.out.println("Linked List is empty! sorry");
        else if(head ==tail){
            head=head.prev;
            tail=tail.prev;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void display(){
        if(head==null) return;
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        if(tail==null) return;
        ListNode temp = tail;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insert(int index, int value){
        if(index >size || index<0) {
            System.out.println("Invalid index");
        }
        else if(index==0) addAtHead(value);
        else if(index==size) addAtTail(value);
        else{
            ListNode temp = head;
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            ListNode a =new ListNode(value);
            ListNode b = temp.next;
            a.prev =temp;
            a.next =b;
            b.prev =a;
            temp.next =a;
            size++;
        }
    }
    // index start with 0 1 2 3 ......
    void delete(int index){
        if(index <0 || index >= size) System.out.println("Invalid Index");
        else if(index ==0) deleteAtHead();
        else if(index == size-1) deleteAtTail();
        else{
            ListNode temp1 = head;
            for(int i=1;i<index;i++){
                temp1 = temp1.next;
            }
            ListNode temp2 = temp1.next.next;
            temp1.next = temp2;
            temp2.prev = temp1;
            size--;
        }
    }
}

public class DoublyLinkedListClass {
    public static void main(String[] arg){
      DLL a1 =new DLL();
        a1.addAtHead(3);
        a1.addAtTail(5);
        a1.addAtHead(4);
        a1.display();
 //     a1.deleteAtHead();
//      a1.displayReverse();
//      a1.insert(2,6);
        a1.delete(1);
        a1.display();
        System.out.println(a1.size);
    }

}
