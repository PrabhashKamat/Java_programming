package BassingSort;

public class MergeSort {
    static void main() {
        int[] arr ={23,4,22,121,3,3,344,44,52};
        DivedSort(arr);
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }

    private static void DivedSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;   // Single array is already sorted

        // Step 1: Create 2 new empty arrays of size n/2
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        // Step 2: Copy and paste arr into a and b
        int idex=0;
        for(int i=0;i<a.length;i++){
            a[i] = arr[idex++];
        }
        for(int j=0;j<b.length;j++){
            b[j] = arr[idex++];
        }
        // Step 3: Magic
        DivedSort(a);
        DivedSort(b);

        // Step 4: Merge 'a' and 'b' into arr
        conquer(a,b,arr);
    }

    public static void conquer(int[] a, int[] b, int[] arr) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                arr[k++] = b[j++];
            }
            else  arr[k++] = a[i++];

        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }
}
