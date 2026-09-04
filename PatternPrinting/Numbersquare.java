package PatternPrinting;

import java.util.Scanner;

public class Numbersquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for (int i = 1; i <=num ; i++) {
            for(int j=0;j<num;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
