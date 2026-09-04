package if_Else;
import java.util.Scanner;
public class Division_5_3 {
    public static void main(String[] arg){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number:");
       int num = sc.nextInt();

       if(num % 5 == 0 && num % 3 == 0 ){
           System.out.println("Number is divisible by both number 5 and 3");
       }
       else if(num % 5 ==0){
            System.out.println("Number is divisible by 5");
        }
       else if(num % 3 == 0){
           System.out.println("Number is divisible by 3");
       }
       else{
           System.out.println("Number is neither divisible by 3 nor 5");
       }
    }
}
