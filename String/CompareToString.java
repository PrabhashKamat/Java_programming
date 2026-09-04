package String;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CompareToString {
    public static int  CompareTo(String x,String y){
        int min = Math.min(x.length(),y.length());

        for(int i=0;i<min;i++){
                if((int) x.charAt(i) != (int) y.charAt(i)) {
                    int finum = (int) x.charAt(i);
                    int senum = (int) y.charAt(i);
                    return finum - senum;
                }
        }
        return -1;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String x = sc.nextLine();

        System.out.print("Enter second string: ");
        String y = sc.nextLine();

        System.out.println(CompareTo(x,y));
    }
}
