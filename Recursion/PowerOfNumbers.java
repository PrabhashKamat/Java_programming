package Recursion;
import java.util.Scanner;

public class PowerOfNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int reverse = reversenumber(num,0);
        System.out.printf("The reverse of %d is %d and %d raised to %d is %d",num,reverse,num,reverse,power(num,reverse));
    }
    public static int reversenumber(int n,int r){
        if(n==0) return r;
        return reversenumber(n/10,r*10+n%10);

    }

    public static int power(int a,int b){
        if(b==0) return 1;
        return a*power(a,b-1);
    }

}
