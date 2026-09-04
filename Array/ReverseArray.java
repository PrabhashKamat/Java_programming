package Array;
import java.util.Scanner;

public class ReverseArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Element of array : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int i=0,j=size-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("Reverse Array : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
