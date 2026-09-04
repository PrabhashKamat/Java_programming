package Array;
import java.util.Scanner;

public class PrintNegativevalue {
    static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len = sc.nextInt();

        System.out.print("Enter array element : ");
        int[] arr = new int[len];
        for(int i =0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array only negative element are : ");
        for(int j =0;j<=len-1;j++){
            if(arr[j] < 0){
                System.out.print(arr[j]+ " ");
            }
        }

    }
}
