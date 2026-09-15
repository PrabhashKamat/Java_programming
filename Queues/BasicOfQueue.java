package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class BasicOfQueue {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.remove()+" "+q);
    }
}
