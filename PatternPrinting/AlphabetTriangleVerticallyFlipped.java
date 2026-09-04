package PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        for(int i =1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            for(int k =1;k<=i;k++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
