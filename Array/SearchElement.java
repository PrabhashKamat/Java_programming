package Array;
import java.util.Scanner;

public class SearchElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        System.out.print("Enter element of array : ");
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element that you want to search : ");
        int search = sc.nextInt();

        boolean found = false;
        for(int j=0;j<size;j++){
            if(arr[j] == search){
                found = true;
                break;
            }
        }
        if(found) System.out.println("Target is exist");
        else System.out.println("Target is not exist");

    }
}
