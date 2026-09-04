package BassingSort;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter element of array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // Bubble sort
        // time = n^2
        for(int i=0;i<size-1;i++){
            int swap =0;
            for(int j=0;j<size-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
