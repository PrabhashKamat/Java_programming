package loops;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int reverse_nu = 0;
        while (n != 0) {
            int last_digit = n % 10;
            reverse_nu *= 10;
            reverse_nu += last_digit;
            n /= 10;
        }
        System.out.println("Reverse number is " + reverse_nu);
    }
}