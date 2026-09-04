package BassingSort;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        // taking input in array
        int[] arr = new int[size];
        System.out.print("Enter Element of array : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // Selection Sort Logic
        for(int i =0;i<size;i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            // Finding min
           for(int j=i;j<size;j++){
               if(min >arr[j]){
                   min=arr[j];
                    mindex=j;
               }
           }
           // swap with min and first
            int temp = arr[i];
            arr[i] = min;
            arr[mindex] = temp;

        }

        // print array
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
