package String;
import java.util.Scanner;

public class CountDigits{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit : ");
        int digit = sc.nextInt();

        String s=""+digit;
        System.out.println("No of digit in number is : " +s.length());

    }
}
