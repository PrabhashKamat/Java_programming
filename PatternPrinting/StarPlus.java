package PatternPrinting;
import java.util.Scanner;

public class StarPlus {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = sc.nextInt();

//        System.out.print("Enter columns : ");
//        int col = sc.nextInt();

        for(int i = 1; i <=row ; i++){
            for(int j=1;j<=row;j++){
                if( row %2 !=0){
                if( (i == row/2+1) || (j==row/2+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                }
            }
            System.out.println();
        }
    }
}
