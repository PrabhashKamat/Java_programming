package loops;

import java.util.Scanner;

public class SumOfDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count =0;
        int sum=0;
        while(n !=0){
            sum+= n % 10;
            n /=10;
            count++;
        }
        System.out.println("Sum of digit is " +((sum >0) ? sum : -sum));
    }
}
