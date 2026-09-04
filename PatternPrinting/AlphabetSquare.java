package PatternPrinting;
import java.util.Scanner;

public class AlphabetSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nu : ");
        int num;
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
