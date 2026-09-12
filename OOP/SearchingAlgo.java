package OOP;
import java.sql.SQLOutput;
import java.util.Scanner;

class Search{
    int[] arr;
    int size;

     void InputFromUser() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of index : ");
         size = sc.nextInt();

         arr = new int[size];
         System.out.print("Enter array element : ");
         for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
         }
     }

    void LinearSearch(int target){
         for(int i=0;i<size;i++){
             if(arr[i]==target){
                 System.out.printf("Target found at index %d\n",i);
                 return;
             }
         }
        System.out.println("Target is not found\n");
    }

    void BinarySearch(int target){
        int low =0;
        int high=size-1;
        while(low < high){
            int mid =low + (high-low)/2;
            if(target==arr[mid]){
                System.out.printf("Target found at index %d\n",mid);
                return;
            }
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        System.out.println("Target is not found\n");
    }

}

public class SearchingAlgo{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Search obj1 = new Search();
        obj1.InputFromUser();
        System.out.print("Enter target element: ");
        int tar = sc.nextInt();

        obj1.LinearSearch(tar);
    }
}
