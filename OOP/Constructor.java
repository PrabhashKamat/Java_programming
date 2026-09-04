package OOP;
// Class 1
class CarConstructor {
    String brand;

    // No-Argument Constructor
    public CarConstructor() {
        brand = "Toyota"; // Custom default value
    }
}

// Class 2
class StudentConstructor {
    String name;
    int age;

    // Parameterized Constructor
    public StudentConstructor(String n, int a) {
        name = n; // 'this' resolves conflict between field and parameter
        age = a;
    }
}

// Class 3
// Constructor Overloading Concept
class Product {
    String name;
    double price;

    // Constructor 1: No arguments
    public Product() {
        this.name = "Generic";
        this.price = 0.0;
    }

    // Constructor 2: One argument
    public Product(String name) {
        this.name = name;
        this.price = 9.99;
    }

    // Constructor 3: Two arguments
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Constructor{
    public static void main(String[] arg) {
        // Class 1 Object
        CarConstructor toy=new CarConstructor();
        System.out.println(toy.brand);

        // Class 2 Object
        StudentConstructor s1 = new StudentConstructor("Prabhash",19);
        System.out.println("Name is: "+s1.name);
        System.out.println("Age is: "+s1.age);

        // Class 3 Object
        Product p1 = new Product("pra1");
        Product p2 = new Product("Pra",9.28);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p2.price);
    }
}
