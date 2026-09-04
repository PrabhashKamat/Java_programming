package PatternPrinting;

import java.util.Scanner;

public class Square {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
