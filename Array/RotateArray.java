package Array;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int[] arr = {91,23,22,12,27,34,78};
        int  size = arr.length;
        int d =3;

        // Reverse whole array
        int i =0,j=size-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // Reverse first size-d elements
        int fIndex = 0;
        int k=size-d-1;

        while(fIndex<k){
            int temp = arr[fIndex];
            arr[fIndex] = arr[k];
            arr[k] =temp;
            fIndex++;
            k--;
        }

        // Reverse last d elements
        int LIndex = size-1;
        int n=size-d;
        while(n<LIndex){
            int temp = arr[n];
            arr[n] = arr[LIndex];
            arr[LIndex] = temp;
            n++;
            LIndex--;
        }
        System.out.print("Rotate array : ");
        for(int ele : arr){
            System.out.print(ele+ " ");
        }

    }
}
