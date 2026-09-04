package if_Else;
import java.util.Scanner;
public class TerneryOperator {
    public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    // condition ? true : false
        System.out.println(n+" is "+((n % 2==0)? "Even" : "Odd"));
    }
}
