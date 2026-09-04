package ArrayList;
import java.util.ArrayList;
public class Basic {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();

        // Taking value in arraylist
        arr.add(25);
        arr.add(11);
        arr.add(12);

        System.out.println(arr.get(2));
        //Update value
        arr.set(1,26);
        arr.set(2,27);

        int n =arr.size();
        for(int i =0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println(arr);

    }
}
