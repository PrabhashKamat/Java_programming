package OOP;

public class PassingClassesToMethods {
    public static class Car{
        String name;
        double length;
        int seats;
        String type;

    }
    static void main() {
        UserDefinedDataTypes.Student s1 = new UserDefinedDataTypes.Student();
        s1.name="Prabhash";
        System.out.printf("Name is %s\n",s1.name);
        // Defined object of class
        Car c = new Car();
        c.name = "Kia Sonet";
        c.length = 3.99;
        c.seats =5;
        c.type = "SUV";

        change(c);
        System.out.println(c.seats);

    }
    // pass by reference is happening
    public static void change(Car c){
        c.seats =4;
    }
}
