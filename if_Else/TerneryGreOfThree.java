package if_Else;
import java.util.Scanner;
public class TerneryGreOfThree {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st number:");
       int num1 = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number:");
        int num3 = sc.nextInt();

        System.out.println((num1 > num2) ? (num1>num3 ? num1+" is Greatest": num3+" is Greatest") :
                (num2>num3 ? num2+" is greatest" : num3+" is Greatest"));

    }
}
