package Heaps;
import java.util.PriorityQueue;

public class PriorityQueueSTL{
    public static  void main(String[] arg){
        // Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10); pq.add(20); pq.add(-10);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.size());
        for(int ele : pq){
            System.out.print(ele+" ");
        }

    }
}
