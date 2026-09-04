package if_Else;
import java.util.Scanner;

public class Quadrant {
   public static void main(String[] arg) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter x value:");
       float x = sc.nextFloat();

       System.out.print("Enter y value:");
       float y = sc.nextFloat();

       if(x ==0 && y == 0){
           System.out.println("Point x and y lies at the origin");
       }
       else if(x >= 0 && y >= 0){
           if(x ==0 && y>0){
               System.out.println("Point x and y lies at the y-axis");
           }
           else if (x>0 && y ==0) {
               System.out.println("Point x and y lies at the x-axis");
           }
           else{
               System.out.println("Point x and y lies at the 1st quadrant");
           }
       } else if (x<0 && y>0) {
           System.out.println("Point x and y lies at the 2nd quadrant");

       } else if (x<0 && y<0) {
           System.out.println("Point x and y lies at the 3rd quadrant");
       } else{
           if(x >0 && y<0){
               System.out.println("Point x and y lies at the 4rd quadrant");
           }
       }
    }
}
