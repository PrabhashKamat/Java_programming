package OOP;
import java.util.Scanner;

class Car{
    void toyota(String color, String name){
        System.out.println("Car name is "+name);
        System.out.println("Color of the car is "+color);
    }
}

public class carclass {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car name : ");
        String name = sc.nextLine();

        System.out.print("Enter color name : ");
        String color = sc.nextLine();

        Car c1 = new Car();
        c1.toyota(color,name);

    }
}
