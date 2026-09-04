package Recursion;
import java.util.Scanner;

public class SumOf1ToN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int ans = CalculateSum(num);
        System.out.println("Sum of "+num+" is "+ans );
    }
    public static int CalculateSum(int n){
        if(n ==0) return 0;
        int sum=n;
        sum += CalculateSum(n-1);
        return sum;
    }
}
