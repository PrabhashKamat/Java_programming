package loops;

import java.util.Scanner;

public class GPSeries1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fist term:");
        int a = sc.nextInt();

        System.out.print("Enter common term:");
        int r = sc.nextInt();

        System.out.print("Enter n term:");
        int n = sc.nextInt();

        for (int i = 0; i <=n ; i++) {
            System.out.print(a+ " ");
            a *=r;
        }
    }
}
