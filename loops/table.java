package loops;
import java.util.Scanner;

public class table {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a table:");
        int  n = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(i*n);
        }
    }
}
