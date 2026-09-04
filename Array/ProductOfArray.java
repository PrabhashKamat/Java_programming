package Array;
import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter element of array : ");
        for(int i =0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int product =1;
        for(int j =0;j<n;j++){
            product *=arr[j];
        }
        System.out.print("Product of the array is " +product);
    }
}
