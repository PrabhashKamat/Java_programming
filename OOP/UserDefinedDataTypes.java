package OOP;
import java.util.Scanner;
import static java.text.ChoiceFormat.nextDouble;

public class UserDefinedDataTypes {
    public static class Student{
        String name;
        int roll_no;
        double cgpa;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter your name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter your Roll number : ");
        s1.roll_no = sc.nextInt();

        System.out.print("Enter your cgpa: ");
        s1.cgpa = sc.nextDouble();

    }
}
