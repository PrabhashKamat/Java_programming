package LikedList;
public class NodeOfLinkedList {

    public static void Displayrecursion(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        Displayrecursion(head.next);
    }

    public static void display(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static int get(Node head,int index){
        Node temp = head;
        for(int i =1;i<=index;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] arg){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Displayrecursion(a);
        System.out.println();

        System.out.println(get(a,3));
    }
}
