package BinarySearch;
public class SearchEleInDesc {
    public static void main(String[] arg){

        int[] arr ={800,740,700,600,560,400,324,250,150,65,55,45};
        int target = 65;
        int low = 0;
        int high = arr.length-1;
        int idex =-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                idex=mid;
            }
            else if(arr[mid]>target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Target found at idex "+idex);
    }
}
