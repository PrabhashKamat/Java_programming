package loops;

import java.util.Scanner;

public class Power {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        System.out.print("Enter power : ");
        int power = sc.nextInt();

        int Answer = 1;
        for (int i = 1; i <=power ; i++) {
            Answer  *= base;
        }
        System.out.println(Answer);
    }
}
