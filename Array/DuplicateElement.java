package Array;

public class DuplicateElement {
    static void main() {
        int[] arr ={2,3,4,5,6,7,8,3};
        int n = arr.length;
        boolean[] flag = new boolean[n+1];

        for(int i =0;i<n;i++) {
            int ele = arr[i];
            if (flag[ele] == true) {
                System.out.println("Duplicate element is " + ele);

                break;
            } else {
                flag[ele] = true;
            }
        }
    }
}
