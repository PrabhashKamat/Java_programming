package PatternPrinting;
import java.util.Scanner;

public class AlphanumericTriangle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {   // Even row -> Alphabets
                for (int j = 1; j <= i; j++) {
                    System.out.print((char) (j + 64) + " ");
                }
            } else {            // Odd row -> Numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+ " ");
                }
            }

            System.out.println(); // Move to next line
        }
    }
}