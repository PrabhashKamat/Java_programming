package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        for(int k=1;k<=2*row-1;k++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp=1;
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=row-i;l++){
                System.out.print("* ");
            }
            nsp+=2;

            System.out.println();
        }
    }
}
