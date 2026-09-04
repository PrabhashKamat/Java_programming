package PatternPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] ag){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int n = sc.nextInt();
        // 1.St method
//        for(int i = 1; i <=n ; i++) {
//            for(int j = 1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=(2*i-1);k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // 2.nd method
        int nsp=n-1,nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
