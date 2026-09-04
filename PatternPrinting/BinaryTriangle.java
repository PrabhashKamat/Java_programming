package PatternPrinting;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        for(int i = 1; i <=row ; i++) {
            for(int j=1;j<=i;j++){
                if((i==j) || ( (i+j)%2 ==0) ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
