package OOP;

public class Polymorphism{
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }

    public static class Lion{
        void speak(){
            System.out.println("GRRRRRRRR----");
        }
    }

    public static class Motu{
        void speak(){
            System.out.println("I want more samosa");
        }
    }

    public static void main(String[] arg) {
            Dog tommy = new Dog();
            Cat bilha = new Cat();
            Lion king = new Lion();
            Motu m1 = new Motu();

            tommy.speak();
            bilha.speak();
            king.speak();
            m1.speak();
    }
}
