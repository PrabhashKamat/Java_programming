package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();
;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int nst = 5;
        for(int m=1;m<row;m++){
            for(int n=1;n<=m;n++){
                System.out.print("  ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("* ");
            }
            nst-=2;
            System.out.println();
        }
    }
}
