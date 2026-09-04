package loops;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact=1;
        while(n !=0){
            fact = fact * n;
            n--;

        }
        System.out.println(fact);
    }
}
