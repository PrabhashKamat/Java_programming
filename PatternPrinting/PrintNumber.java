package PatternPrinting;

import java.util.Scanner;

public class PrintNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int r = sc.nextInt();

        for(int i = 1; i <=r ; i++) {
            for(int j =1;j<=r;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
