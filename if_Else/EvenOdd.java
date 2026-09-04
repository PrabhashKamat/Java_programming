package if_Else;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        if(number % 2 ==0) {
            System.out.println("Enter number is an even number");
        }
        else{
            System.out.println("Enter number is an odd number");
        }
    }
}
