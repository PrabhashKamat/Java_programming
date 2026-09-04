package PatternPrinting;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        System.out.print("Enter columns : ");
        int col = sc.nextInt();

        for(int i = 1; i <=row ; i++) {
            for(int j=1;j<=col;j++){
                if(i ==1 || i == row || j==1 || j==col)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
