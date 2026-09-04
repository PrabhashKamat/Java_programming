package if_Else;
import java.rmi.MarshalException;
import java.util.Scanner;
public class RectangleIsGreThenPeri {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle:");
        double len = sc.nextDouble();

        System.out.print("Enter Breadth of the Rectangle:");
        double bre = sc.nextDouble();

        double AreOfRec= len * bre;

        double PeriOfRec = 2*(len + bre);

        if(AreOfRec > PeriOfRec){
            System.out.println("Area is greater than perimeter");
        }
        else if(AreOfRec == PeriOfRec){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Area is not greater than perimeter");
        }




    }
}
