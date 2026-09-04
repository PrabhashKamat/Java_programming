package PatternPrinting;
import java.util.Scanner;

public class Rectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter col : ");
        int col = sc.nextInt();

        for(int i = 1; i <=rows ; i++) {
            for(int j =1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
