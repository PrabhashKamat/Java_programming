package PatternPrinting;
import java.util.Scanner;

public class StarFlippedTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
