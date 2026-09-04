package Recursion;
import java.util.Scanner;

public class OneToN {
    static  int n;
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();

        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+ " ");
        print(n-1);
        if(n!=1) System.out.print(n+" ");
    }
}
