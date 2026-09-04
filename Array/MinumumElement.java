package Array;

import java.util.Scanner;

public class MinumumElement {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter element of array : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int j=0;j<size;j++){
            if(arr[j] < min){
                min =arr[j];
            }
        }
        System.out.println("Minumum element of array is " +min);
    }
}
