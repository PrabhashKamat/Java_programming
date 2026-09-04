package PatternPrinting;

import java.util.Scanner;

public class OddnNumberTriangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int num = sc.nextInt();

        for (int i = 1; i <=num ; i++) {
            int a =1;
            for(int j = 1;j<=i;j++){
                System.out.print(a+ " ");
                a +=2;
            }
            System.out.println();
        }
    }
}
