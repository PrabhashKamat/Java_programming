package PatternPrinting;

import java.util.Scanner;

public class FilppedTriangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        for(int i = 1; i <=row ; i++) {
            for(int j =1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(row-i+1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
