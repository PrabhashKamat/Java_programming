package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }

        System.out.println("Reversed ArrayList:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
