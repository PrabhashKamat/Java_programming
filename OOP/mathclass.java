package OOP;

import java.util.Scanner;

class Math{
    int num1;
    int num2;

    void accept(int number1,int number2){
        num1 = number1;
        num2 = number2;
    }
    void addition(){
        System.out.println("Addition of two number is : " +(num1+num2));
    }
    void substraction(){
        System.out.println("Substraction of two number is : " +(num1-num2));
    }
    void multiplication(){
        System.out.println("Multiplication of two number is : " +(num1*num2));
    }
    void division(){
        System.out.println("Division of two number is : " +(num1/num2));
    }

}
public class mathclass {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();

        Math m1 = new Math();
        m1.accept(n1,n2);
        m1.addition();
        m1.substraction();
        m1.multiplication();
        m1.division();
    }
}
