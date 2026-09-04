package loops;

import java.util.Scanner;

public class Series {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n term:");
        int n = sc.nextInt();

        for (int i = 99; i >0 ; i-=4) {
            System.out.println(i+" ");
        }
    }
}
