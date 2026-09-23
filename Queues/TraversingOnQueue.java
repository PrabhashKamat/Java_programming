package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class TraversingOnQueue {
    public static void main(String[] arg) throws Exception{
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);

        addAtPosi(q,60,3);
        removeAtPosi(q,3);
//        System.out.println(peekAtPosi(q,1));
        display(q);

    }
    public static void addAtPosi(Queue<Integer> q,int value,int index){
        int n = q.size();
        for(int i =1;i<=index;i++){
            q.add(q.remove());
        }
        q.add(value);
        for(int i=1;i<=n-index;i++){
            q.add(q.remove());
        }

    }
    public static void removeAtPosi(Queue<Integer> q,int index) throws Exception{
        int n = q.size();
        if(n==0) {
            throw new Exception("queue is Empty");
        }
        else {
            for (int i = 1; i <= index - 1; i++) {
                q.add(q.remove());
            }
            // remove value at given index
            q.remove();
            for (int i = 1; i <= n - index; i++) {
                q.add(q.remove());
            }
        }
    }
    public static int peekAtPosi(Queue<Integer> q, int index) throws Exception{
        int n =q.size();
        if(index==0 || index >n){
            throw new Exception("Invalid index number");
        }else {
            int temp;
            for (int i = 1; i <= index - 1; i++) {
                q.add(q.remove());
            }
            temp = q.remove();
            q.add(temp);
            for (int i = 1; i <= n - index; i++) {
                q.add(q.remove());
            }
            return temp;
        }

    }
    public static void display(Queue<Integer> q){
        int n =q.size();
        for(int i=1;i<=n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }

}
