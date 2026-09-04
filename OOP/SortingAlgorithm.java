package OOP;
import java.util.Scanner;

class TypesOfSort{
    int size;
    int[] arr;
    TypesOfSort(){

    }

    void InputFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = sc.nextInt();
        arr = new int[size];

        System.out.print("Enter array element: ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }

    void print(){
        System.out.print("Array element is: ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    void BubbleSort(){
        for(int i=0;i<size;i++){
            int count =0;
            for(int j=0;j<size-1-i;j++){
                if(arr[j] > arr[j+1]){
                      int temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                      count++;
                }
            }
            // when array already sorted
            if(count ==0) return;
        }
    }

    void SelectionSort(){
        for(int i =0;i<size-1;i++){
            int min = Integer.MAX_VALUE;
            int minindex = -1;
            for(int j=i;j<size;j++){
                if(min > arr[j]){
                    min = arr[j];
                    minindex=j;
                }
            }

            // swapping min with current i index
            int temp = arr[i];
            arr[i] = min;
            arr[minindex] = temp ;

        }

    }

    void InsertionSort(){
        for(int i =1;i<size;i++){
            int j =i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    void MergeSort(int[] arr) {
        // Base condition
        if (arr.length <= 1) {
            return;
        }

        int[] a = new int[arr.length / 2];
        int[] b = new int[arr.length - arr.length / 2];

        int index = 0;
        // Copy first half
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[index++];
        }

        // Copy second half
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[index++];
        }

        // Recursive calls
        MergeSort(a);
        MergeSort(b);

        // Merge sorted arrays
        Merge(a, b, arr);
    }

    // MergeSort unction for merge two sorted array
    void Merge(int[] a, int[] b, int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] > b[j]){
                arr[k] = b[j];
                k++;
                j++;
            }
            else{
                arr[k++] = a[i++];
            }
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }

    void QuickSort(int[] arr,int low, int high){
        // Base condition
        if(low >= high) return;
        int paridex=  partition(arr,low,high);

        // For Left Subarray
        QuickSort(arr,low,paridex-1);

        // For Right Subarray
        QuickSort(arr,paridex+1,high);
    }

    int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(i <= high - 1 && arr[i] <= pivot){
                i++;
            }

            while(j >= low + 1 && arr[j] > pivot){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Put pivot in its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}

public class SortingAlgorithm {
    public static void main(String[] arg) {
        TypesOfSort s1 = new TypesOfSort();

        s1.InputFromUser();
        s1.print();
//      s1.BubbleSort();
//      s1.SelectionSort();
//      s1.InsertionSort();
//      s1.MergeSort(s1.arr);
        s1.QuickSort(s1.arr,0,s1.size-1);
        s1.print();
    }
}
