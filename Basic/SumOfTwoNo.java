package Basic;
import java.util.Scanner;
public class SumOfTwoNo {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int num1 = sc.nextInt();

        System.out.print("Enter second number:");
        int num2 = sc.nextInt();

        System.out.print("Enter third number:");
        int num3 = sc.nextInt();

        System.out.println("Sum of three number is "+(num1+num2+num3));

    }
}
