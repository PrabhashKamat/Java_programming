package Array;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,12,-12,13,155};

        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i]){
                max =arr[i];
            }
        }
        System.out.println("Maximum element is " +max);
    }
}
