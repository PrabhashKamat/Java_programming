package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        for(int i = 1; i <=row ; i++) {
            for(int j =1;j<=row-i;j++){
                System.out.print("  ");
            }
            for(int k =1;k<=row;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
