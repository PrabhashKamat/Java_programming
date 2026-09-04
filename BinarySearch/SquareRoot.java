package BinarySearch;
import java.util.Scanner;

public class SquareRoot {
   public static void FloorSquareRoot(int n){
        for(int i=1;i<=n;i++){
            if(i*i>n){
                System.out.println("Square root is: "+(i-1));
                break;
            }
        }
   }
   public static int FloorSqRoBin(int n){
        int low=0;
        int high= n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid >n) high = mid-1;
            else low=mid+1;
        }
        return high;
   }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        FloorSquareRoot(n);
        int sqroot = FloorSqRoBin(n);
        System.out.println("Square root is: "+sqroot);
    }

}
