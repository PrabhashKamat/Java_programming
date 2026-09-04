package Recursion;

public class RecursionOnArrays {
    public static void main(String[] arg){
        int[] arr = {2,13,131,34,2,5,6,7};
//        print(arr,0);
        int target = 5;
        System.out.println(exists(arr,0,target));
    }

    public static boolean exists(int[] arr, int index, int ele){
        if(index==arr.length) return false;
        if(arr[index]==ele) return true;
        return exists(arr, index +1,ele);
    }

//    public static void print(int[] arr, int index){
//        if(index == arr.length) return;
//        System.out.print(arr[index]+" ");
//        print(arr,index+1);
//    }
}
