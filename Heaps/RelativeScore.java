package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;

class Player implements Comparable<Player>{
    int score;
    int index;
    Player(int score, int index){
        this.score = score;
        this.index = index;
    }
    public int compareTo(Player p){
        return Integer.compare(this.score,p.score);
    }
}
public class RelativeScore {
    public static void main() {
        int[] score = {5,4,3,2,1};
        String[] str = findRelativeRanks(score);
        for(String ele : str){
            System.out.println(ele);
        }
    }
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Player> pq = new PriorityQueue<>(Collections.reverseOrder());
        // Store score and original index
        for (int i = 0; i < score.length; i++) {
            pq.add(new Player(score[i], i));
        }
        String[] ans = new String[score.length];

        int rank = 1;
        while (!pq.isEmpty()) {
            Player current = pq.remove();
            int index = current.index;

            if(rank == 1) ans[index] = "Gold Medal";
            else if(rank ==2) ans[index] = "Silver Medal";
            else if(rank == 3) ans[index] = "Bronze Medal";
            else  ans[index] = Integer.toString(rank);
            rank++;
        }

        return ans;
    }
}
