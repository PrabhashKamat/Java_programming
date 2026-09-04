package LikedList;
class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
class Linkedlist{
    Node head;   // null
    Node tail;
    int size;  // null
    Linkedlist(){

    }
    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int index =0;
        while(temp !=null){
            if(temp.val == val) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
    void addAtTail(int value){
        Node temp = new Node(value);
        if(tail==null) head = tail = temp;
        else{
            tail.next=temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int value){
        Node temp = new Node(value);
        if(head == null) head =tail=temp;
        else{
            temp.next= head;
            head = temp;
        }
        size++;
    }
    void addAtIndex(int idx,int value){
        if(idx > size || idx < 0) {
            System.out.println("invalid index");
        }
        else if(idx == 0) addAtHead(value);
        else {
            Node temp = head;
            for(int i =0;i<=idx-1;i++){
                if(i == idx-1){
                    Node t= new Node(value);
                    t.next = temp.next;
                    temp.next = t;
                    size++;
                }
                temp = temp.next;
            }
        }
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("Linked list is empty! Sorry");
        }
        else {
            head = head.next;
        }
        if(head==tail) tail = null;
        size--;
    }
    void deleteAtTail(){
        if(head==null){
            System.out.println("Linked list is empty! Sorry");
        }
        else if(head==tail){
            tail = null;
            head = null;
        }
        else{
            for(int i=1;i<=size;i++){
                Node temp = head;
                if(i==size-1){
                    temp.next =null;
                    tail = temp;
                    size--;
                }
                temp = temp.next;
            }
        }
    }
    void deleteAtIndex(int idx){
        if(idx >= size || idx <0) System.out.println("Invalid index");
        else if(idx ==0) deleteAtHead();
        else{
            Node temp = head;
            for(int i =0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] arg){
        Linkedlist l1 = new Linkedlist();
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtHead(10);
        // l1.display();
//      l1.deleteAtHead();
//      System.out.println(l1.size);
//      System.out.println(l1.search(10));
        l1.addAtIndex(3,40);
        l1.display();
        System.out.println(l1.size);
//        l1.deleteAtTail();
        l1.deleteAtIndex(1);
        l1.display();

    }
}
