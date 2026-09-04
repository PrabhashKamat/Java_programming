package Recursion;
import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int ans= fac(n);
        System.out.println(ans);
    }
    public static int fac(int n){
        if(n==0 || n==1) return 1;
        return n*fac(n-1);
    }
}
