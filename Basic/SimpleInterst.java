package Basic;

import java.util.Scanner;
public class SimpleInterst {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle:");
        double principle = sc.nextDouble();

        System.out.print("Enter rate:");
        int rate = sc.nextInt();

        System.out.print("Enter time in month:");
        int time = sc.nextInt();

        double SI = (principle*rate*time)/100;

        System.out.println("Simple Interest is " + SI);
    }
}
