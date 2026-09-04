package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main() {
        int[] arr={10,23,12,24};
//        int[] x=arr;           //  Shallow Copy
//        x[0] =100;
//        System.out.println(arr[0]);

        int[] y= Arrays.copyOf(arr,arr.length);  // Deep copy
        y[0] = 100;
        System.out.println(arr[0]);
    }
}
