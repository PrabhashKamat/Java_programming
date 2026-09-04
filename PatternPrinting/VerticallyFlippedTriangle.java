package PatternPrinting;

import java.util.Scanner;

public class VerticallyFlippedTriangle {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row or columns : ");
        int n = sc.nextInt();

        //  1.st method

//        for(int i = 1; i <=n ; i++) {
//            for(int j =1;j<=n;j++){
//                if(i+j >n){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i;j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
