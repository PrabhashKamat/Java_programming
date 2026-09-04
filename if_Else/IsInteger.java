package if_Else;
import java.util.Scanner;
public class IsInteger {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       double num = sc.nextDouble();
       int x = (int)num;
       if(num-x == 0){
           System.out.println("Is an Integer");
       }
       else {
           System.out.println("Not An Integer");
       }
    }
}
