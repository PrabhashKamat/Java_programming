package Heaps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>{
    int x;
    int y;
    int dis;
    Triplet(int x, int y, int dis){
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
    public int compareTo(Triplet T){
        return Integer.compare(this.dis,T.dis);
    }
}
public class KClosestPointsToOrigin{
    public static void main(String[] args){
        int[][] arr = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k = 3;
        ArrayList<ArrayList<Integer>> ans = kClosest(arr, k);
        for(ArrayList<Integer> a : ans){
            System.out.println(a);
        }

    }
    public static ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int[] point : points) {
            int x = point[0];
            int y = point[1];
            int dist = x * x + y * y;

            // pass object triplet into priority queue
            pq.add(new Triplet(x, y, dist));
            if (pq.size() > k) pq.remove();
        }
        // remove element from priority queue and add into arrayList
        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(top.x);
            temp.add(top.y);

            ans.add(temp);
        }
        return ans;
    }
}


