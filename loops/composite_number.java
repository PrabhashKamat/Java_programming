package loops;
import java.util.Scanner;
public class composite_number {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for(int i = 2;i<=num-1;i++){
            if(num%i==0){
                System.out.println("Composite number");
                break;
            }
        }

    }
}
