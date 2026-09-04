package PatternPrinting;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if( (i==j) || (j+i==n+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
