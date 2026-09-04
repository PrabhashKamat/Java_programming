package OOP;
import java.util.Scanner;

class Student{
    int RollNo;
    String name;
    int sub1,sub2,sub3;

    void accept(int r,String Name,int s1,int s2,int s3){
        RollNo = r;
        name = Name;
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    void display() {
        int total = sub1 + sub2 + sub3;
        double percentage = total / 3.0;
        System.out.println("Roll No : "+ RollNo);
        System.out.println("Name : "+name);
        System.out.println("Total : "+total);
        System.out.println("Percentage : "+percentage);
    }
}
public class StudentPercentage {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No : ");
        int roll_No = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your name:");
        String Name = sc.nextLine();

        System.out.print("Enter 1st subject marks : ");
        int subject1 = sc.nextInt();

        System.out.print("Enter 2nd subject mark : ");
        int subject2 = sc.nextInt();

        System.out.print("Enter 3rd subject mark : ");
        int subject3 = sc.nextInt();

        Student s1 = new Student();
        s1.accept(roll_No, Name,subject1,subject2,subject3);
        s1.display();
    }
}
