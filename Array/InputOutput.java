package Array;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
//        int[]  array= {2,4,5,63,23,33};
//        int n = array.length;
//        for(int i =0;i<=n-1;i++){
//            System.out.print(array[i]+"  ");
//        }
        int[] arr = new int[8];
        System.out.print("Enter your element : ");
        for(int i =0;i<8;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.print("Element are : ");
        for(int i = 0; i <8 ; i++) {
            System.out.print(arr[i]+ "  ");
        }
      }
}
