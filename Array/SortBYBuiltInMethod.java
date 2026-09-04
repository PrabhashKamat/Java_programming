package Array;
import java.util.Arrays;
public class SortBYBuiltInMethod {
    static void main() {
        int[] arr ={12,122,3,-3,0,23,-7};
        PrintArray(arr);
        Arrays.sort(arr);
        PrintArray(arr);
    }
    public static void PrintArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
