package String;
import java.util.Scanner;


public class Basics {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String n = sc.nextLine();
        int count=0;
        for(int i=0; i<n.length();i++){
            char ch =n.charAt(i);
            if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
               count+=1;
            }
        }
        System.out.println(count);
        String x="Prabh";
        String y= "Prch";

    }
}
