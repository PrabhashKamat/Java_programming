package if_Else;
import java.util.Scanner;
public class LossProfit {
   public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price:");
        int cost_price = sc.nextInt();

        System.out.print("Enter selling price:");
        int sell_price = sc.nextInt();

        if (cost_price > sell_price) {
            System.out.println("Loss");
        }
        else if (cost_price == sell_price) {
            System.out.println("neither profit nor loss");
        }
        else{
            System.out.println("Profit");
        }
    }

}
